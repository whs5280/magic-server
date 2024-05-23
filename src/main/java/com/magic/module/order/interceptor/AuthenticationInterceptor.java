package com.magic.module.order.interceptor;

import com.magic.common.exception.ParamException;
import com.magic.common.util.AesUtil;
import com.magic.common.util.JedisUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import java.nio.charset.StandardCharsets;

@Slf4j
public class AuthenticationInterceptor implements HandlerInterceptor {
    private final JedisUtil jedisUtil;

    public AuthenticationInterceptor(JedisUtil jedisUtil) {
        this.jedisUtil = jedisUtil;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json");
        response.setCharacterEncoding(StandardCharsets.UTF_8.toString());

        // 解析Token
        String authorization = request.getHeader("Authorization");
        String authId = request.getHeader("AuthId");
        if (StringUtils.isEmpty(authorization)) {
            log.error("token is empty");
            throw new ParamException("token is empty");
        }

        String token = AesUtil.decrypt(authorization);
        String redisToken = jedisUtil.getValue(String.format("%s_%s", "hd-designer:_token", authId));

        if (token.equals(redisToken)) {
            request.setAttribute("userId", authId);
            return true;
        } else {
            log.error("token is error");
            throw new ParamException("token is error");
        }
    }
}

package com.magic.module.order.config;

import com.magic.common.util.JedisUtil;
import com.magic.module.order.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    private final JedisUtil jedisUtil;

    public InterceptorConfig(JedisUtil jedisUtil) {
        this.jedisUtil = jedisUtil;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor(jedisUtil))
                .addPathPatterns("/api/order/**")
                .excludePathPatterns("/api/order/delayQueue", "/api/order/queue");
    }
}

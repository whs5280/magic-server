package com.magic.common.exception;

import com.magic.common.response.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理业务异常
     *
     * @param e 异常对象
     * @return 响应
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<?> handlerBusinessException(BusinessException e) {
        log.error("处理业务异常，异常信息:[{}]", e.getMessage(), e);
        return ResponseEntity.badRequest().body(ResponseResult.fail(e.getMessage()));
    }

    /**
     * 处理参数异常
     *
     * @param e 异常对象
     * @return 响应
     */
    @ExceptionHandler(ParamException.class)
    public ResponseEntity<?> handlerParamException(ParamException e) {
        log.error("处理参数异常，异常信息:[{}]", e.getMessage(), e);
        return ResponseEntity.badRequest().body(ResponseResult.fail(e.getMessage()));
    }
}

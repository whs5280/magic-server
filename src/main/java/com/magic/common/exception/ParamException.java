package com.magic.common.exception;

public class ParamException extends BusinessException{
    public ParamException(String message) {
        super(message);
    }

    public ParamException(String message, Throwable e) {
        super(message, e);
    }

    public ParamException(String message, int code) {
        super(message, code);
    }

    public ParamException(String message, int code, Throwable e) {
        super(message, code, e);
    }
}

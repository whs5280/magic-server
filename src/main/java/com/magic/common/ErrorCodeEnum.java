package com.magic.common;

public enum ErrorCodeEnum {
    SUCCESS("请求成功！"),
    FAIL("请求失败！"),

    /**
     * 常见错误
     */
    NETWORK_ERROR("服务器繁忙，请稍候重试！"),
    NOT_FOUND("数据不存在，请刷新后重试！"),
            ;

    private final String errorMessage;

    ErrorCodeEnum(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

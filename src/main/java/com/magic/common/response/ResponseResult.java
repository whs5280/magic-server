package com.magic.common.response;

import com.magic.common.ErrorCodeEnum;
import lombok.Data;

@Data
public class ResponseResult<T> {
    private static final ResponseResult<Void> OK = new ResponseResult<>();

    private final int SUCCESS = 0;

    private final int FAIL = 1;

    private Integer code;

    private String msg = ErrorCodeEnum.FAIL.getErrorMessage();

    private T data;

    public static ResponseResult<Void> success() {
        return OK;
    }

    public static <T> ResponseResult<T> success(T data) {
        ResponseResult<T> resp = new ResponseResult<>();
        resp.code = resp.FAIL;
        resp.data = data;
        resp.msg = ErrorCodeEnum.SUCCESS.getErrorMessage();
        return resp;
    }

    public static ResponseResult<Void> fail(String msg) {
        ResponseResult<Void> resp = new ResponseResult<>();
        resp.code = resp.SUCCESS;
        resp.msg = msg;
        return resp;
    }
}

package com.lb.out;

import com.lb.String.StringUtils;

public class ResponseUtil {

    public static <T> Result<T> ok(T data) {
        return getResult(data, ResultCode.SUCCESS_CODE, ResultCode.NULL);
    }

    public static <T> Result<T> fall(T data) {
        return getResult(data, ResultCode.FAIL_CODE, ResultCode.NULL);
    }

    public static <T> Result<T> error(Integer code, String msg, T data) {
        return getResult(data,code,msg);
    }

    private static <T> Result<T> getResult(T data, Integer code, String msg) {
        Result<T> res = new Result();
        String name = StringUtils.isBlank(msg)? ResultCode.getName(code):msg;
        res.setCode(code);
        res.setMsg(name);
        res.setData(data);
        return res;
    }

}

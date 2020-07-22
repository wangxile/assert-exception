package com.wangxile.assertexception;

/**
 * @author wangqi
 * @version 1.0
 * @date 2020/7/20 0020 17:07
 */

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

/**
 * 基础异常类
 * @author xiaozhi009
 * @time 2019年7月8日下午2:37:09
 */

public class BaseException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     */
    protected IResponseEnum responseEnum;
    /**
     * 异常消息参数
     */
    protected Object[] args;

    public BaseException(IResponseEnum responseEnum) {
        super(responseEnum.getMessage());
        this.responseEnum = responseEnum;
    }

    public BaseException(int code, String msg) {
        super(msg);
        this.responseEnum = new IResponseEnum() {
            @Override
            public int getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return null;
            }
        };
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String msg) {
        super(msg);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String msg,
                         Throwable cause) {
        super(msg, cause);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public IResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public Object[] getArgs() {
        return args;
    }
}

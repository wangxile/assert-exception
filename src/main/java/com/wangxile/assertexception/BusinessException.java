package com.wangxile.assertexception;

/**
 * @author wangqi
 * @version 1.0
 * @date 2020/7/20 0020 16:52
 */
public class BusinessException extends  BaseException {

    private static final long serialVersionUID = 1L;

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}

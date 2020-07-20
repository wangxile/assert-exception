package com.wangxile.assertexception;

import java.text.MessageFormat;

/**
 * @author wangqi
 * @version 1.0
 * @date 2020/7/20 0020 16:53
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);
        return new BusinessException(this, args, msg, t);
    }

}

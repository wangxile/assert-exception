package com.wangxile.assertexception;

/**
 * @author wangqi
 * @version 1.0
 * @date 2020/7/20 0020 17:08
 */
public class Test {

    public static void main(String[] args) {
        String a = null;
        ResponseEnum.BAD_LICENCE_TYPE.assertNotNull(a);
    }
}

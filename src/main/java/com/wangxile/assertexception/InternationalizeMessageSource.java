package com.wangxile.assertexception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * 信息国际化处理类
 */
@Service
public class InternationalizeMessageSource {

    @Autowired
    private MessageSource messageSource;

    /**
     * 获取国际化消息
     * 解析code对应的信息进行返回，如果对应的code不能被解析则返回默认信息defaultMessage。
     * @param code 需要进行解析的code，对应资源文件中的一个属性名
     * @param args 需要用来替换code对应的信息中包含参数的内容，如：{0},{1,date},{2,time}
     * @param defaultMessage 当对应code对应的信息不存在时需要返回的默认值
     * @return
     */
    public String getMessage(String code, Object[] args, String defaultMessage){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code,args,defaultMessage,locale);
    }

    /**
     * 获取国际化消息
     *  解析code对应的信息进行返回，如果对应的code不能被解析则返回默认信息 ""。
     * @param code 需要进行解析的code，对应资源文件中的一个属性名
     * @param args 需要用来替换code对应的信息中包含参数的内容，如：{0},{1,date},{2,time}
     * @return
     */
    public String getMessage(String code, Object[] args) {
        return getMessage(code, args, "");
    }

    /**
     * 获取国际化消息
     * @param code 需要进行解析的code，对应资源文件中的一个属性名
     * @return
     */
    public String getMessage(String code) {
        return getMessage(code, null);
    }
}

package com.hafiz.www.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * @author hafiz.zhang
 * @description: spring 上下文工具类
 * @date Created in 2017/11/28 21:07.
 */
public class SpringAware implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;

    public SpringAware() {
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        applicationContext = ac;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    public static void rollBack() {
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }
}

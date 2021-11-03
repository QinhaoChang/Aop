package AopHomework.impl;

import AopHomework.AfterInterceptor;

import java.lang.reflect.Method;

public class AfterInterceptorImpl extends AfterInterceptor {
    @Override
    public void InterceptAfter(Object proxy, Method method, Object[] args){
        System.out.println("Intercepting after actual method execution");

    }
}

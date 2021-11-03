package AopHomework.impl;

import AopHomework.BeforeInterceptor;

import java.lang.reflect.Method;

public class BeforeInterceptorImpl extends BeforeInterceptor {
    @Override
    public void InterceptBefore(Object proxy, Method method, Object[] args) {
        System.out.println("Intercept before actual method execution");
    }
}

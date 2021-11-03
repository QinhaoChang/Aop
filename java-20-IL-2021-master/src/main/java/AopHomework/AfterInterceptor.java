package AopHomework;

import java.lang.reflect.Method;

public abstract class AfterInterceptor extends AroundInterceptor {
    public abstract void InterceptAfter(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object Proxy, Method method, Object[] args) throws Throwable{
        Object result = method.invoke(getAspectObject(), args);
        InterceptAfter(proxy, method, args);
        return result;
    }
}

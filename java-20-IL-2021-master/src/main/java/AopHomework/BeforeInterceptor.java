package AopHomework;

import java.lang.reflect.Method;

public abstract class BeforeInterceptor extends AroundInterceptor{
    public abstract void handleBefore(Object proxy, Method method, Object[] args);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleBefore(proxy, method, args);
        return method.invoke(getAspectObject(), args);
    }
}

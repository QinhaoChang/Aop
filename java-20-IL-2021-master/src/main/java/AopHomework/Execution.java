package AopHomework;

import java.lang.reflect.Proxy;
import java.util.List;

public class Execution {

    public static Object getProxy(Object AspectObject, List<AroundInterceptor> Interceptors) {
        Object proxyObject = null;
        if (Interceptors.size() > 0) {
            proxyObject = AspectObject;
            for (int i = 0; i < Interceptors.size(); i++) {
                Interceptors.get(i).setAspectObject();
                Object(proxyObject);
                proxyObject = Proxy.newProxyInstance(AspectObject.getClass()
                        .getClassLoader(), AspectObject.getClass()
                        .getInterfaces(), Interceptors.get(i));
            }
            return proxyObject;
        } else {
            return AspectObject;
        }

    }
}


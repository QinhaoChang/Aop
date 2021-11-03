package AopHomework;

public abstract class AroundInterceptor implements InvocationInterceptor {
    private Object AspectObject;

    public void setAspectObject(Object AspectObject){
        this.AspectObject = AspectObject;
    }
    public Object getAspectObject() {
        return AspectObject;
    }
}

package com.javaweb.invocation_handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * It is proxy class, that catches some method,
 * make some job and invoke that method
 *
 * @author Andrii Chernysh
 */
public class NeverSleepingEye implements InvocationHandler {
    private Object obj;

    public NeverSleepingEye(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Never sleeping eye invoke " + method.getName());
        return method.invoke(obj, args);
    }
}

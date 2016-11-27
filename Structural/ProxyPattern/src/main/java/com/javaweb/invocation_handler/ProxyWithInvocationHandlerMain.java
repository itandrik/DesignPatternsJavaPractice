package com.javaweb.invocation_handler;

import java.lang.reflect.Proxy;

/**
 * Implementation of class, that wee need to proxy
 *
 * @author Andrii Chernysh
 */
public class ProxyWithInvocationHandlerMain {
    public static void main(String[] args) {
        Person person = new Person();

        IPerson personProxy = (IPerson) Proxy.newProxyInstance(Person.class.getClassLoader(),
                Person.class.getInterfaces(),
                new NeverSleepingEye(person));

        personProxy.setName("Гриша");
        String name = personProxy.getName();
        personProxy.rename("Вася");
    }
}

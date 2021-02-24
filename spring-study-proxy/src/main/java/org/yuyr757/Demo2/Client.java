package org.yuyr757.Demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();
    }
}


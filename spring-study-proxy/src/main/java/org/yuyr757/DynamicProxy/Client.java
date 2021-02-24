package org.yuyr757.DynamicProxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    @Test
    public void test1() {
        // 我们这里把ProxyInvocationHandler和Proxy放在了一块，也可以分开写
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        Host host = new Host();
        // 设置需要代理的真实对象
        proxyInvocationHandler.setRent(host);
        // 用真实对象来创建一个代理类
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        // 代理对象也实现了Rent接口，调用代理类的rent方法
        proxy.rent();
    }

    @Test
    public void test2(){

        Rent host = new Host();
        ProxyInvocationHandler2 invocationHandler = new ProxyInvocationHandler2();
        invocationHandler.setRent(host);
        Rent proxy = (Rent) Proxy.newProxyInstance(
                Rent.class.getClassLoader(),
                host.getClass().getInterfaces(),
                invocationHandler);
        proxy.rent();
    }
}

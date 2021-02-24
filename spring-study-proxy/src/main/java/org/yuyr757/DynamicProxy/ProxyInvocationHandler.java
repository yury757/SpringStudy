package org.yuyr757.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                Rent.class.getClassLoader(),
                rent.getClass().getInterfaces(),
                this
                );
    }

    // 处理代理实例并返回结果的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.seeHouse();
        Object object = method.invoke(rent, args);
        this.payFee();
        return object;
    }

    public void seeHouse(){
        System.out.println("中介带看房");
    }

    public void payFee(){
        System.out.println("付房租");
    }
}

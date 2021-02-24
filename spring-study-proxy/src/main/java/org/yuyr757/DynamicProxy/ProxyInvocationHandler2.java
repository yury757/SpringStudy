package org.yuyr757.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler2 implements InvocationHandler {
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.seeHouse();
        Object object = method.invoke(this.rent, args);
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

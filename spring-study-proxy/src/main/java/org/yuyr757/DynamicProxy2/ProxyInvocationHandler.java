package org.yuyr757.DynamicProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    /**
     * 设置真实对象，相当于代理对象要和真实对象签定委托代理的契约，代理对象才可以有权限对做真实对象才能做的事情
     * 就像现实生活中，租房中介要拿到房东的授权委托书，中介才可以有权去代理房东租房
     */
    public void setTarget(Object target) {
        this.target = target;
    }

    public ProxyInvocationHandler() {
    }

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 生成一个代理对象，即生成一个租房中介
     * @loader 这个中介的类加载器和房东是一样的，即他们的级别是一样的
     * @interfaces 这个中介的接口和房东是一样的，即他们都应该有相同的动作
     * @h 这个中介拿到一个InvocationHandler对象，即每当客户有租房的动作时，租房的动作会通过InvocationHandler转发到自己的invoke方法，代理对象就可以在invoker方法中做一些额外操作
     * 此外newProxyInstance方法内部还会授予相关代理权限，不然任何一个没有权限的人都可以代理房东去租房
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(),
                this
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.log(method.getName());
        Object returnObject = method.invoke(target, args);
        return returnObject;
    }

    public void log(String msg){
        System.out.println("调用了" + msg + "方法");
    }
}

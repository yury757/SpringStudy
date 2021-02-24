package org.yuyr757.DynamicProxy2;

import org.yuyr757.Demo2.UserService;
import org.yuyr757.Demo2.UserServiceImpl;
import org.yuyr757.Demo2.UserServiceImpl2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        UserService userservice = new UserServiceImpl();
        ProxyInvocationHandler handler = new ProxyInvocationHandler(userservice);
        UserService proxy = (UserService)handler.getProxy();
        System.out.println("=============查看生成的类的具体信息=============");
        Class proxyClass = proxy.getClass();
        System.out.println("类名称：" + proxyClass.getName());
        System.out.println("类加载器：" + proxyClass.getClassLoader());
        System.out.println("类接口：" + Arrays.toString(proxyClass.getInterfaces()));
        System.out.println("类的父类：" + proxyClass.getSuperclass());
        System.out.println("public方法和父类的public方法：");
        for (Method method : proxyClass.getMethods()) {
            System.out.println(method.toString());
        }
        System.out.println("所有本类的方法：");
        for (Method method : proxyClass.getDeclaredMethods()) {
            System.out.println(method.toString());
        }
        System.out.println("所有本类的属性：" );
        for (Field declaredField : proxyClass.getDeclaredFields()) {
            System.out.println(declaredField);
        }
        System.out.println("=============测试方法=============");
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
        System.out.println("=============代理其他实现了该接口的类只需要修改目标对象即可=============");
        handler.setTarget(new UserServiceImpl2());
        UserService proxy2 = (UserService)handler.getProxy();
        proxy2.add();
        proxy2.delete();
        proxy2.update();
        proxy2.query();
    }
}

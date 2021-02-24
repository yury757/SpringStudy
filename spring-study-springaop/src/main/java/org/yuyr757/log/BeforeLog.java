package org.yuyr757.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method 要执行的目标对象的方法
     * @param objects 参数
     * @param o 目标对象，实际上是target
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "类的" + method.getName() + "被执行了");
    }
}

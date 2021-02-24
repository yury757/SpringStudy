package org.yuyr757.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method 目标对象执行的方法
     * @param args 参数
     * @param target 目标对象
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "方法的结果为" + returnValue);

    }
}

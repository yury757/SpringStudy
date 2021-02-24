package org.yuyr757.DiyAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DiyPointCut2 {
    @Before("execution(* org.yuyr757.services.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=========方法执行前2=========");
    }

    @After("execution(* org.yuyr757.services.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=========方法执行后2=========");
    }

    @Around("execution(* org.yuyr757.services.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("=========环绕前=========");
        // 执行方法
        Object object = pj.proceed();
        System.out.println("=========环绕后=========");
    }
}

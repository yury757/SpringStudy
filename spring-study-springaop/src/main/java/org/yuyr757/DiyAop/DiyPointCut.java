package org.yuyr757.DiyAop;

import org.aspectj.lang.ProceedingJoinPoint;

public class DiyPointCut {
    public void before(){
        System.out.println("=========before通知=========");
    }

    public void after(){
        System.out.println("=========after通知=========");
    }

    public void afterReturning(){
        System.out.println("=========afterReturning通知=========");
    }

    public void afterThrowing(){
        System.out.println("=========afterThrowing通知=========");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object object = 0;
        try{
            System.out.println("=========around通知前=========");
            object = joinPoint.proceed();
            System.out.println("=========around通知-afterReturning=========");
        }catch (IllegalArgumentException e){
            System.out.println("=========around通知-afterThrowing=========");
        }finally {
            System.out.println("=========around通知后=========");
        }
        return object;
    }
}

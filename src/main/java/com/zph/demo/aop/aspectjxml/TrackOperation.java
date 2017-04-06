package com.zph.demo.aop.aspectjxml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation{
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("beforeAdvice()");
    }
    public void afterAdvice(JoinPoint jp) {
        System.out.println("afterAdvice()");
    }
    public void afterReturningAdvice(JoinPoint jp,Object result) {
        System.out.println("afterReturningAdvice() - additional concern");
        System.out.println("afterReturningAdvice() - Method Signature: "  + jp.getSignature());
        System.out.println("afterReturningAdvice() - Result in advice: "+result);
        System.out.println("afterReturningAdvice() - end of after returning advice...");
    }
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundAdvice() - Additional Concern Before calling actual method");
        Object obj=pjp.proceed();
        System.out.println("aroundAdvice() - Additional Concern After calling actual method");
        return obj;
    }
    public void afterThrowingAdvice(JoinPoint jp,Throwable error)//it is advice
    {
        System.out.println("afterThrowingAdvice() - additional concern");
        System.out.println("afterThrowingAdvice() - Method Signature: "  + jp.getSignature());
        System.out.println("afterThrowingAdvice() - Exception is: "+error);
        System.out.println("afterThrowingAdvice() - end of after throwing advice...");
    }
}
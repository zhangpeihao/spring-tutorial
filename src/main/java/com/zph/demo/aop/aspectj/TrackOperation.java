package com.zph.demo.aop.aspectj;

import com.zph.demo.aop.springaop.ThrowsAdvisor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TrackOperation{
    @Pointcut("execution(* Operation.*(..))")
    public void all(){}//pointcut name

    @Before("all()")//applying pointcut on before advice
    public void beforeAllAdvice(JoinPoint jp) {
        System.out.println("beforeAllAdvice() - additional before all");
    }
    @After("all()")
    public void afterAllAdvice(JoinPoint jp) {
        System.out.println("afterAllAdvice() - additional after all");
    }

    @Pointcut("execution(* Operation.m*(..))")
    public void m(){}

    @Before("m()")
    public void beforeMAdvice(JoinPoint jp) {
        System.out.println("beforeMAdvice() - adddition before m");
    }

    @AfterReturning(
            pointcut = "execution(* Operation.*(..))",
            returning = "result")
    public void afterReturningAdvice(JoinPoint jp, Object result) {
        System.out.println("afterReturningAdvice() - additional concern");
        System.out.println("afterReturningAdvice() - Method Signature: "  + jp.getSignature());
        System.out.println("afterReturningAdvice() - Result in advice: "+result);
        System.out.println("afterReturningAdvice() - end of after returning advice...");
    }

    @Around("all()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundAdvice() - Additional Concern Before calling actual method");
        Object obj=pjp.proceed();
        System.out.println("aroundAdvice() - Additional Concern After calling actual method");
        return obj;
    }

    @AfterThrowing(
            pointcut = "all()",
            throwing = "error"
    )
    public void afterThrowingAdvice(JoinPoint jp, Throwable error) {
        System.out.println("afterThrowingAdvice() - Method Signature: "  + jp.getSignature());
        System.out.println("afterThrowingAdvice() - Exception is: "+error);
        System.out.println("afterThrowingAdvice() - end of after throwing advice...");
    }
}

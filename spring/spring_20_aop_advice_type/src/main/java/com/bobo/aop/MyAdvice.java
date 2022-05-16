package com.bobo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.bobo.dao.BookDao.update())")
    private void pt(){};

    // @Before("pt()")
    public void before() {
        System.out.println("before advice...");
    }

    // @After("pt()")
    public void after() {
        System.out.println("after advice...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice...");
        proceedingJoinPoint.proceed();
        System.out.println("around after advice...");
    }

    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }
}

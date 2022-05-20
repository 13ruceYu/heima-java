package com.bobo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean com.bobo.service.*Service.*(*, *))")
    private void servicePoint() {}

    @Around("servicePoint()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {

        Object[] args = pjp.getArgs();

        System.out.println("args");

        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }

        return pjp.proceed(args);
    }
}

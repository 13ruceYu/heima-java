package com.bobo.controller;

import com.bobo.exception.BusinessException;
import com.bobo.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 处理系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 1. 记录日志
        // 2. 发送消息给运维
        // 3. 发送邮件给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 处理业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doSystemException(BusinessException ex) {
        return new Result(ex.getCode(), null, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        System.out.println("yo, exception...");
        return new Result(50001, null, "异常了！！");
    }
}

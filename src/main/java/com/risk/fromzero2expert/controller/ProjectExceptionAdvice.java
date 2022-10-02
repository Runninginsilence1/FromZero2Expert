package com.risk.fromzero2expert.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : [47140]
 */
//@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public void catchEx (Exception exception) {
        System.out.println("我调用了异常的方法");
    }
}

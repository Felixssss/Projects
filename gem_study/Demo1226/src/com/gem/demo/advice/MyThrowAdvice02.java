package com.gem.demo.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyThrowAdvice02 implements ThrowsAdvice {
    //方法固定
	 /*public void afterThrowing(ArithmeticException ex) throws Throwable {
	        System.out.println("执行schema-based异常通知："+ex.getMessage());
	 }*/

    public void afterThrowing(Method m, Object[] args, Object target, ArithmeticException ex) {
        System.out.println("执行schema-based异常通知：四个参数");
    }
}
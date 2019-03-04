package com.gem.demo.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)
            throws Throwable {
        //通知参数
        //arg0:切点对象方法
        //arg1[]  参数
        //arg2:切点对象所在的类对象
	/*	System.out.println(arg0.getName());
		System.out.println(arg1.length);
		System.out.println(arg2);*/
        //arg2
        System.out.println("前置通知");

    }

}
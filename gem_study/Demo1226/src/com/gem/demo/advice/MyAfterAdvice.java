package com.gem.demo.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object arg0, Method arg1, Object[] arg2,
                               Object arg3) throws Throwable {
        //返回值对象
        //切点对象的返回值
		/*System.out.println(arg0);
		//切点方法对象
		System.out.println(arg1);
		//切点方法的参数对象数组
		System.out.println(arg2.length);
		//切点对象所在的类
		System.out.println(arg3);*/
        System.out.println("后置通知");

    }

}

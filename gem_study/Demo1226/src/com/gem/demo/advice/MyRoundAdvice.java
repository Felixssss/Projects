package com.gem.demo.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyRoundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation arg0) throws Throwable {
        System.out.println("环绕之前");
        Object result=arg0.proceed();//放行 调用切点方法
        System.out.println("环绕之后");
        return result;
    }

}

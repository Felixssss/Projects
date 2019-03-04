package com.gem.demo.advice;

public class MyThorwAdvice {
    public void myexecption(ArithmeticException e){
        System.out.println("异常通知:"+e.getMessage());

    }
}

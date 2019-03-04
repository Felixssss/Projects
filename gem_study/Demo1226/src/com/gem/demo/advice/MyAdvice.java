package com.gem.demo.advice;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
    /*public void mybefore(){
    System.out.println("前置通知");

}*/
    public void mybefore(String name,int age){
        //获取到了切点参数
        System.out.println(name+"--"+age);
        System.out.println("前置通知");

    }
    public void myafter(){
        System.out.println("后置通知");
    }
    public void myaftering(){
        System.out.println("后置通知ing");
    }
    public void myexception(){
        System.out.println("异常通知");
    }
    public Object myround(ProceedingJoinPoint procee) throws Throwable{
        System.out.println("环绕之前");
        Object result=procee.proceed();//放行
        System.out.println("环绕之后");
        return result;

    }
}

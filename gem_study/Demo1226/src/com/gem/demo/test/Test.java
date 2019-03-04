package com.gem.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo=ac.getBean("demo",Demo.class);
        try {
            //调用切点
            demo.demo01("张三",18);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        }
		/*demo.demo02();
		demo.demo03();*/
    }
}

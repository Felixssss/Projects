package com.gem.demo.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象p
        Person p=ac.getBean("p",Person.class);
        System.out.println(p);

    }
}

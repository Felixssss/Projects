package com.gem.demo.factory;

import com.gem.demo.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p=ac.getBean("p",Person.class);
        System.out.println(p);
    }
}

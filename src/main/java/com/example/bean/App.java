package com.example.bean;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean = (MyBean) context.getBean("MyBean");
        System.out.println(myBean);
    }
}

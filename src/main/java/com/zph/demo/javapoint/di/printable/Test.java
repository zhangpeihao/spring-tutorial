package com.zph.demo.javapoint.di.printable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Printable p=(Printable)context.getBean("p");
        p.print();
    }
}
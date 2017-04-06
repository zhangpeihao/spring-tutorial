package com.zph.demo.aop.aspectjxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test{
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectjXmlContext.xml");
        Operation op = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");
        op.msg();
        System.out.println("calling m...");
        op.m();
        System.out.println("calling k...");
        op.k();
        try{
            op.validate(11);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

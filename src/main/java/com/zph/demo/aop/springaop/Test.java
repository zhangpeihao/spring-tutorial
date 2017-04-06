package com.zph.demo.aop.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aopContext.xml");

        A a=context.getBean("proxy",A.class);
        System.out.println("proxy class name: "+a.getClass().getName());
        a.m();

        Validator v = context.getBean("proxyv", Validator.class);
        try{
            v.validate(12);
        }catch(Exception e){
            System.out.println("Catch exception");
            e.printStackTrace();
        }
    }
}

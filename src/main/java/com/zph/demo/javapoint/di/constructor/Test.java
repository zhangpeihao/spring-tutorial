package com.zph.demo.javapoint.di.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class Test {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Employee s=(Employee)factory.getBean("e");
        s.show();
        s=(Employee)factory.getBean("e1");
        s.show();
        s=(Employee)factory.getBean("e2");
        s.show();
        s=(Employee)factory.getBean("e3");
        s.show();
        s=(Employee)factory.getBean("ea");
        s.show();
    }
}

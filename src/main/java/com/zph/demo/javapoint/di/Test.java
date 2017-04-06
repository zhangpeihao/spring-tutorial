package com.zph.demo.javapoint.di;

/**
 * Created by zhangpeihao on 17/4/6.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Student student;
        student = LoadBeanByBeanFactory("applicationContext.xml", "studentbean");
        student.displayInfo();
        student = LoadBeanByApplicationContext("applicationContext.xml", "studentbean");
        student.displayInfo();
    }

    public static Student LoadBeanByBeanFactory(String file, String name) {
        Resource resource=new ClassPathResource(file);
        BeanFactory factory=new XmlBeanFactory(resource);
        return (Student)factory.getBean(name);
    }

    public static Student LoadBeanByApplicationContext(String file, String name) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(file);
        return (Student)ctx.getBean(name);
    }
}

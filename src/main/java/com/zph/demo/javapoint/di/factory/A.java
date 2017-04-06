package com.zph.demo.javapoint.di.factory;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class A {
    private static final A obj=new A();
    private A(){System.out.println("private constructor");}
    public static A getA(){
        System.out.println("factory method ");
        return obj;
    }
    public void msg(){
        System.out.println("hello user");
    }
}
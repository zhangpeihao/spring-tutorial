package com.zph.demo.javapoint.di.autowiring;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class A {
    B b;
    A(){System.out.println("a is created");}
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
    void print(){System.out.println("hello a");}
    void display(){
        print();
        b.print();
    }
}
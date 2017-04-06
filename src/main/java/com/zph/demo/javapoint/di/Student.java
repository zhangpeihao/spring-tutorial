package com.zph.demo.javapoint.di;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name);
    }
}

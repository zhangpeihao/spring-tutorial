package com.zph.demo.javapoint.di.printable;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class PrintableFactory {
    public static Printable getPrintable(){
        return new B();
        //return new A();//return any one instance, either A or B
    }
}

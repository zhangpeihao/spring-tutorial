package com.zph.demo.aop.springaop;

/**
 * Created by zhangpeihao on 17/4/6.
 */
public class Validator {
    public void validate(int age)throws Exception{
        if(age<18){
            throw new ArithmeticException("Not Valid Age");
        }
        else{
            System.out.println("vote confirmed");
        }
    }
}

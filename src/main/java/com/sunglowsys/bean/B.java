package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;

    @Autowired
    public B(A a) {
        this.a = a;
    }

    public void getB(){
        System.out.println("from b");
    }
}

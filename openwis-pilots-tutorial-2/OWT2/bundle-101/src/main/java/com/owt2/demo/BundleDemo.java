package com.owt2.demo;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class BundleDemo {
    @PostConstruct
    public void init() {
        System.out.println("A new Bundle has started!");
    }

}

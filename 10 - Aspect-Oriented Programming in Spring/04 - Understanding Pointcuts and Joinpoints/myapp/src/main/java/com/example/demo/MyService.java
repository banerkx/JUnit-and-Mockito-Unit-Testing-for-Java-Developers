package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void doSomething() {
        System.out.println("Doing business method...");
    }

    public void doSomeOtherThing() {
        System.out.println("Doing a different business method...");
    }

}

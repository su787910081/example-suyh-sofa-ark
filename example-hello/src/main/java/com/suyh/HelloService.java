package com.suyh;

public class HelloService {
    private final SayHello sayHello = new SayHello();

    public void hello() {
        sayHello.sayHello();
    }
}

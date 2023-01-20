package com.suyh;

public class HelloService {
    private final SayHello sayHello = new SayHello();

    public void hello() {
        System.out.println("HelloService class loader: " + HelloService.class.getClassLoader());
        sayHello.sayHello();
    }
}

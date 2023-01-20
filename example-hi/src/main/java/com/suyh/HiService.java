package com.suyh;

public class HiService {
    private final SayHi sayHi = new SayHi();

    public void hi() {
        System.out.println("HiService class loader: " + HiService.class.getClassLoader());
        sayHi.sayHi();
    }
}

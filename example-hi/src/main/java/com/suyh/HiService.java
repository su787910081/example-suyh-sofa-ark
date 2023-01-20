package com.suyh;

public class HiService {
    private final SayHi sayHi = new SayHi();

    public void hi() {
        sayHi.sayHi();
    }
}

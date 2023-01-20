package com.suyh;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SofaArkBootstrap.launch(args);
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("DemoApplication class loader: " + DemoApplication.class.getClassLoader());
    }
}

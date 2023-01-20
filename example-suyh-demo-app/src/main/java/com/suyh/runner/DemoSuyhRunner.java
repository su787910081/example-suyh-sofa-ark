package com.suyh.runner;

import com.suyh.HelloService;
import com.suyh.HiService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoSuyhRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        HelloService helloService = new HelloService();
        helloService.hello();
        HiService hiService = new HiService();
        hiService.hi();
    }
}

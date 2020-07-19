package com.wdm.lifestylebackground;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LifestyleBackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifestyleBackgroundApplication.class, args);
    }

}

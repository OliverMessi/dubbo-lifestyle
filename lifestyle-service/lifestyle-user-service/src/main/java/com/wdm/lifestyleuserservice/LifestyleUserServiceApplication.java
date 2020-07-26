package com.wdm.lifestyleuserservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.wdm.mapper")
public class LifestyleUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifestyleUserServiceApplication.class, args);
    }

}

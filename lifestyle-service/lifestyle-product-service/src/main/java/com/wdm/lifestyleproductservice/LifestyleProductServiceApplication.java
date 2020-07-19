package com.wdm.lifestyleproductservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.wdm.mapper")
public class LifestyleProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifestyleProductServiceApplication.class, args);
    }

}

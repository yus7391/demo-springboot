package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yusong
 */
@SpringBootApplication
@MapperScan("com.example.mapper")
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        System.out.println("main begin ....");
        SpringApplication app = new SpringApplication(DemoSpringbootApplication.class);
        //去掉 banner
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        System.out.println("main end ....");
    }
}

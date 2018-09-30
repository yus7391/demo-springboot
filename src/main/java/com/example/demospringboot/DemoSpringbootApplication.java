package com.example.demospringboot;

import com.example.demospringboot.dao.TbUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@MapperScan("com.example.demospringboot.dao")
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		System.out.println("main begin ....");
		SpringApplication.run(DemoSpringbootApplication.class, args);
		System.out.println("main end ....");
	}
}

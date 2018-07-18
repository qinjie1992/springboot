package com.example;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mapper")//这样才能找到mapper文件
public class RunApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
		System.out.println("启动完成。。。。。。。。。。。");
	}
}

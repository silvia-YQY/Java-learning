package com.shopping_car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 启动spring框架，由spring框架进行控制之后的程序。
        SpringApplication.run(Application.class, args);
    }
}

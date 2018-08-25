package com.s.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
@MapperScan("com.s.cart.mapper")
public class CommentStart {
    public static void main(String[] args) {
        SpringApplication.run(CommentStart.class,args);
    }
}

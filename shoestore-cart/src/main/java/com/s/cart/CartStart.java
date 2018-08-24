package com.s.cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
@MapperScan("com.s.cart.mapper")
public class CartStart {
    public static void main(String[] args) {
        SpringApplication.run(CartStart.class,args);
    }
}

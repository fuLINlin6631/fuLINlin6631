package com.s.homepage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
@MapperScan("com.s.homepage.mapper")
public class HomepageStart {
    public static void main(String[] args) {
        SpringApplication.run(HomepageStart.class,args);
    }
}

package com.s.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
@MapperScan("com.s.sso.dao")
public class SsoStart {
    public static void main(String[] args) {
        SpringApplication.run(SsoStart.class,args);
    }
}

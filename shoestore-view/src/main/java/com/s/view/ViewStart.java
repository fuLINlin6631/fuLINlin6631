package com.s.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class ViewStart {
    public static void main(String[] args) {
        SpringApplication.run(ViewStart.class,args);
    }
}

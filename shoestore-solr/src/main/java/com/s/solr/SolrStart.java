package com.s.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class SolrStart {
    public static void main(String[] args) {
        SpringApplication.run(SolrStart.class,args);
    }
}

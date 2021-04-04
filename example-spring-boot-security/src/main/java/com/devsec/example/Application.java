package com.devsec.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import cn.licoy.encryptbody.annotation.EnableEncryptBody;


//@EnableEncryptBody
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Test");
        System.out.println("Changes in update 1");

        System.out.println("Changes in update 1..2");

        System.out.println("In new test");
        
         System.out.println("In new test  ...");

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}

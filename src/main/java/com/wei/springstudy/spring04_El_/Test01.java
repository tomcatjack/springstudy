package com.wei.springstudy.spring04_El_;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Test01 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(Test01.class, args);
        String str1=context.getEnvironment().getProperty("person.sex");
        System.out.println("1");
        System.out.println(str1);
        System.out.println("2");
    }
}

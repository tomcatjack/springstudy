//package com.wei.springstudy.spring04_EL;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//
//@Configuration
//@ComponentScan("com.wei.springstudy.spring04_EL")
//@PropertySource("classpath:com/wei/springstudy/spring04_EL/test.properties")
//public class Config03 {
//
//    @Value("i love you")
//    private String normal;
//
//    @Value("#demoService.another")
//    private String another;
//
//    @Value("${person.name}")
//    private String name;
//
//    @Value("${person.sex}")
//    private String sex;
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    public void sout(){
//        System.out.println(normal);
//        System.out.println(another);
//        System.out.println(name);
//        System.out.println(sex);
//    }
//}

package com.wei.springstudy.spring01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationConfigApplicationContext 作为spring的容器
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(Config01.class);
        UseFunctionService bean = annotationConfigApplicationContext.getBean(UseFunctionService.class);
        System.out.println(bean.sayHello("hello spring"));
        annotationConfigApplicationContext.close();
    }
}

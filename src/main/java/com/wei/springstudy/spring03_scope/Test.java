package com.wei.springstudy.spring03_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *Scope，也称作用域 在 Spring IoC 容器是指其创建的 Bean 对象相对于其他 Bean 对象的请求可见范围
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(Config03.class);
        DemoSingletonService beanSingleton1 = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoSingletonService beanSingleton2 = annotationConfigApplicationContext.getBean(DemoSingletonService.class);
        DemoPrototypeService beanPrototype1 = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        DemoPrototypeService beanPrototype2 = annotationConfigApplicationContext.getBean(DemoPrototypeService.class);
        System.out.println(beanSingleton1.equals(beanSingleton2)); //true
        System.out.println(beanPrototype1.equals(beanPrototype2)); //false
    }
}

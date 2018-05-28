package com.wei.springstudy.spring02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 此处是声明一个配置类,这意味着这个类里面有可能有0个或者多个@Bean注解，此时没有使用包扫描
 * 是因为所有的bean都在此类中定义了
 *
 * 再spring容器中，只要容器存在某个bean，就可以再另一个bean声明方法时使用 例如 FunctionService bean
 *
 * <p>
 * ComponentScan
 * 扫这个包下面带有 @Service @Component @Repository @Controller 的类，并注册成bean
 */

@Configuration
public class Config02 {

    @Bean
    public FunctionService getFunctionService() {
        return new FunctionService();
    }

//    @Bean
//    public UseFunctionService useFunctionService() {
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(getFunctionService());
//        return useFunctionService;
//    }

    @Bean
    public UseFunctionService useFunctionService1(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }


}

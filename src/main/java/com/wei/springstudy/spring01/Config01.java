package com.wei.springstudy.spring01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 此处是声明一个配置类
 *
 * ComponentScan
 * 扫这个包下面带有 @Service @Component @Repository @Controller 的类，并注册成bean
 */

@Configuration
@ComponentScan("com.wei.springstudy.spring01")
public class Config01 {

}

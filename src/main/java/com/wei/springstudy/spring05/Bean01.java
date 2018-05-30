package com.wei.springstudy.spring05;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * prefix属性指定properties的配置前缀
 *
 * location 指定properties 的位置  默认是application.properties
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Bean01 {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

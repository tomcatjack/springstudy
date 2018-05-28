package com.wei.springstudy.spring04_El_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Value("${person.name}")
    private  String name;
    @Value("${person.sex}")
    private  String want;


    public String speak() {
        return "=========>" + name;

    }
}

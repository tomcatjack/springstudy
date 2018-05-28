package com.wei.springstudy.spring04_El_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${person.name}")
    private  String name;
    @Value("${person.sex}")
    private  String want;

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String hexo(){
        return name+","+want;
    }

    @RequestMapping("/el")
    public String el(){
        return userService.speak();
    }
}

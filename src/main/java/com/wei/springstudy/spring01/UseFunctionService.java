package com.wei.springstudy.spring01;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UseFunctionService {

//    @Autowired
    @Resource
    FunctionService functionService;

    public String sayHello(String str){
        return functionService.sayHlleo(str);
    }
}

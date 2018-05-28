package com.wei.springstudy.spring02;

//没有service autowired 注解
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String str) {
        return functionService.sayHlleo(str);
    }
}

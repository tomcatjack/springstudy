package com.wei.springstudy.spring05;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller01 {

    @Autowired
    Bean01 bean01;

    @RequestMapping("/01")
    public String hexo(){
        log.info(bean01.getName() + bean01.getSex());
        return bean01.getName() + bean01.getSex();
    }


}

package com.wei.springstudy;

import com.wei.springstudy.spring04_El_.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class Test01 {

   @Autowired
   UserService userService;

    @Test
    public void test() {
        userService.speak();
    }
}

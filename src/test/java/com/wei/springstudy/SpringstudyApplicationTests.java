package com.wei.springstudy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringstudyApplicationTests {

	@Value("${person.sex}")
	private String name;

	@Test
	public void contextLoads() {
		log.info(name);
	}

}

package com.jbit;

import com.jbit.service.IfService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneappApplicationTests {


	@Resource
	public IfService ifService;
	@Test
	public void contextLoads() {
	}

}

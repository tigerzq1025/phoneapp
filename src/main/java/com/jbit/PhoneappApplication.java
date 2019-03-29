package com.jbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.jbit.dao")
public class PhoneappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneappApplication.class, args);
	}

}

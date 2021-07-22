package com.example.springPractice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPractice1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringPractice1Application.class, args);
		Practice p=context.getBean(Practice.class);
		p.show();

		Practice p1=context.getBean(Practice.class);
		p1.show();


	}

}

package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProject2Application {

	public static void main(String[] args) {
		System.out.println("spring application started");
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringProject2Application.class, args);
		
		A a1= new A();					// create a object of class A using traditional way
		a1.m1();
		
		A a2 = ctx.getBean(A.class);     // create a object using Spring
		a2.m1();
		
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootGuruApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootGuruApplication.class, args);
		InjectionByConstructor byConstructor=(InjectionByConstructor) context.getBean(InjectionByConstructor.class);
		SetterInjection setterInjection=context.getBean(SetterInjection.class);
		byConstructor.getMessage();
		setterInjection.getMessage();
		

	}
	/*
	 * injection de dependence
	 */

}

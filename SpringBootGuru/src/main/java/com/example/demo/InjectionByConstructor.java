package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionByConstructor {

	private HelloWorldService worldService;


	@Autowired

	public InjectionByConstructor(HelloWorldService worldService) {
		super();
		this.worldService = worldService;
	}




	public void getMessage() {
		worldService.sayHello();
	}
}

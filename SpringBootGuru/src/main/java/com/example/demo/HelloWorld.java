package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements HelloWorldService {
	public void sayHello() {
		System.out.println("hello world");
	}

}

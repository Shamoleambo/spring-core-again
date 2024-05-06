package com.tidcode.springcore.entity;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	public String speak() {
		return "Meow meow!";
	}
}

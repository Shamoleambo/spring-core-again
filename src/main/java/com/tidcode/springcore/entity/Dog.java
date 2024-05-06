package com.tidcode.springcore.entity;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public Dog() {
		System.out.println("Inside Dog");
	}

	public String speak() {
		return "Au au!";
	}
	
}

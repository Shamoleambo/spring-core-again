package com.tidcode.springcore.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog implements Animal {

	public Dog() {
		System.out.println("Inside Dog");
	}

	public String speak() {
		return "Au au!";
	}

}

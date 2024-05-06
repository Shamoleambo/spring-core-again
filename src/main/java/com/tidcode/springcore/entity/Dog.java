package com.tidcode.springcore.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Dog implements Animal {

	public Dog() {
		System.out.println("Inside Dog");
	}

	public String speak() {
		return "Au au!";
	}
	
	@PostConstruct
	public void doDogBegin() {
		System.out.println("Let's au au, all over!");
	}
	
	@PreDestroy
	public void endDogness() {
		System.out.println("I have aued enough!");
	}

}

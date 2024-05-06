package com.tidcode.springcore.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Cat implements Animal {

	public Cat() {
		System.out.println("Inside Cat");
	}

	public String speak() {
		return "Meow meow!";
	}
	
	@PostConstruct
	public void doCatBegin() {
		System.out.println("I'm gonna CAAAAAAT!");
	}
	
	@PreDestroy
	public void catsEnding() {
		System.out.println("No wonder I'm the best, I've catted all over your face!");
	}
}

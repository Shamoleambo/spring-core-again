package com.tidcode.springcore.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

	public String speak() {
		return "Au au!";
	}
}

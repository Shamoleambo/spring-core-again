package com.tidcode.springcore.entity;

public class Bird implements Animal {

	@Override
	public String speak() {
		return "Beep beep!";
	}

}

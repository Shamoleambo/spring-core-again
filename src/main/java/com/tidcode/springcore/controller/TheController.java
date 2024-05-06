package com.tidcode.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tidcode.springcore.entity.Animal;

@RestController
@RequestMapping("/api")
public class TheController {

	private Animal animal1;
	private Animal animal2;

	@GetMapping("/animal")
	public String getAnimalSound() {
		return this.animal1.speak();
	}

	@GetMapping("/truth")
	public boolean getTruthAboutDog() {
		return animal1 == animal2;
	}

	@Autowired
	public void setAnimal1(@Qualifier("bird") Animal animal1) {
		this.animal1 = animal1;
	}

	@Autowired
	public void setAnimal2(@Qualifier("dog") Animal animal2) {
		this.animal2 = animal2;
	}

}

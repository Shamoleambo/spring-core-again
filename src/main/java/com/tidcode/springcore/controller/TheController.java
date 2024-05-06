package com.tidcode.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tidcode.springcore.entity.Animal;

@RestController
@RequestMapping("/api")
public class TheController {

	private Animal animal;

	@Autowired
	public TheController(Animal animal) {
		this.animal = animal;
	}

	@GetMapping("/animal")
	public String getAnimalSound() {
		return this.animal.speak();
	}

}

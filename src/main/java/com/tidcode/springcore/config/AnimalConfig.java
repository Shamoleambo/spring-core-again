package com.tidcode.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tidcode.springcore.entity.Animal;
import com.tidcode.springcore.entity.Bird;

@Configuration
public class AnimalConfig {

	@Bean
	public Animal bird() {
		return new Bird();
	}

}

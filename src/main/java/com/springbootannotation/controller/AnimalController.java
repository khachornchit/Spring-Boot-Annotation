package com.springbootannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootannotation.service.Animal;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
//	@Qualifier("cat")
	@Autowired
	private Animal cat;

	@GetMapping
	public String fetchDogAction() {
		return cat.action();
	}
}

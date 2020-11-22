package com.springbootannotation.bean;

import org.springframework.stereotype.Service;

import com.springbootannotation.service.Animal;

@Service
public class Cat implements Animal {

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "Meow";
	}

}

package com.springbootannotation.bean;

import org.springframework.stereotype.Service;
import com.springbootannotation.service.Animal;

//@Primary
@Service
public class Dog implements Animal {

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "Bark";
	}

}

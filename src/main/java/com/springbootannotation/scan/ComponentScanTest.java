package com.springbootannotation.scan;

import org.springframework.stereotype.Component;

@Component
public class ComponentScanTest {

	public void hello() {
		System.out.println("Hello from scan test");
	}
}

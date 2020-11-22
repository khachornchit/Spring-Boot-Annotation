package com.springbootannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootannotation.bean.Customer;
import com.springbootannotation.scan.ComponentScanTest;
import com.springbootannotation.service.CustomerService;

@RestController
public class ApiController {

	@Value("${customer.firstName:N/A}")
	String customerFirstName;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ComponentScanTest componentScanTest;
	
	@GetMapping("api/customer")
	public Customer getCustomer() {
		componentScanTest.hello();
		return customerService.getCustomer();
	}
	
	@GetMapping("api/customer/name")
	public String getName() {
		return customerService.getName() + " : " + customerFirstName;
	}
	
}

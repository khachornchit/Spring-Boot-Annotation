package com.springbootannotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootannotation.bean.Customer;
import com.springbootannotation.config.CustomerProvider;

@Component
public class CustomerService {
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private CustomerProvider customerProvider;

	public String getName() {
		return "Customer";
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public CustomerProvider getCustomerProvider() {
		return customerProvider;
	}
}

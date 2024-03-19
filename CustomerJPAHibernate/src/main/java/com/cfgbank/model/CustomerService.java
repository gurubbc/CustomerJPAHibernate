package com.cfgbank.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerService() {
		System.out.println("CustomerService object is created");
	}
	
	public String addACustomer(Customer customer) {
		// This will generate the required SQL at the back end
		customerRepository.save(customer);
		return "Customer object is successfully stored";
	}
}

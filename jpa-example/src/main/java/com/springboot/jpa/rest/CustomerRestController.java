package com.springboot.jpa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.entity.Customer;
import com.springboot.jpa.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Customer> getAllCustomers() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Customer> getCustomerById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@RequestMapping(value = "/lastName/{lastName}", method = RequestMethod.GET, produces = "application/json")
	public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
		return repository.findByLastName(lastName);
	}
	
}

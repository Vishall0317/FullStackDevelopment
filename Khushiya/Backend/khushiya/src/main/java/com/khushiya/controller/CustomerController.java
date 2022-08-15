package com.khushiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khushiya.entity.Customer;
import com.khushiya.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {
	
	@Autowired CustomerService customerService;
	
	@CrossOrigin
	@PostMapping(path = "/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		if (customerService.saveCustomer(customer)) {
			return new ResponseEntity<>("Customer saved", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Customer falied to save", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

package com.khushiya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khushiya.dao.CustomerRepository;
import com.khushiya.entity.Customer;
import com.khushiya.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired CustomerRepository customerRepository;

	@Override
	public boolean saveCustomer(Customer customer) {
		try {
			Customer savedCustomer = customerRepository.save(customer);
			if (savedCustomer != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}

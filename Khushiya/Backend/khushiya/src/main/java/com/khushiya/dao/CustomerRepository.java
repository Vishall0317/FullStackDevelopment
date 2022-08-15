package com.khushiya.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khushiya.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}

package com.flightSearch.dao;

import org.springframework.data.repository.CrudRepository;

import com.flightSearch.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String>{

}

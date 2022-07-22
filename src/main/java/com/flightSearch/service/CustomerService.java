package com.flightSearch.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightSearch.dao.CustomerRepo;
import com.flightSearch.entity.Customer;

@Service
public class CustomerService {
	
	
	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> customerList = new ArrayList<>();
		customerRepo.findAll()
		.forEach(customerList::add);
		return customerList;
	}
	
	public void addCustomer(Customer customer)
	{
		customerRepo.save(customer);
	}
	
	public Customer addCustomerByUrl(String name, String email, String message, String number)
	{
		Customer customer = new Customer();
		customer.setName(name);
		customer.setMessage(message);
		customer.setNumber(number);
		customer.setEmail(email);
		customerRepo.save(customer);
		
		log.error("name :" + name + " email :" + email + " message :" + message + " number :" + number);
		return customer;
	}
	
	public Customer getCustomer(String id)
	{
		return customerRepo.findOne(id);
	}
	
	public void updateCustomer(String id, Customer customer)
	{
		customerRepo.save(customer);
	}
	
	public void deleteCustomer(String id)
	{
		customerRepo.delete(id);
	}
	
	

}

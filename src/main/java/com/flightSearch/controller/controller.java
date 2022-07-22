package com.flightSearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightSearch.entity.Customer;
import com.flightSearch.service.CustomerService;

@RestController
@RequestMapping(value = "/chintoo")
public class controller {

	
	@Autowired
	public CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET, value ="/getAllCustomers")
	public List<Customer> getCustomers()
	{
		return customerService.getAllCustomers();

	}

	
	@RequestMapping(method = RequestMethod.POST, value="/addCustomer" )
	public void addCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/addCustomerByUrl/{name},{email}" )
	public Customer addCustomerByUrl(@PathVariable String name, @PathVariable String email, String message, String number)
	{
		return customerService.addCustomerByUrl(name, email, message, number);
	}

	@RequestMapping(method = RequestMethod.GET, value ="/getCustomer/{id}")
	public Customer getCustomer(@PathVariable String id)
	{
		return customerService.getCustomer(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/updateCustomer/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String id)
	{
		customerService.updateCustomer(id, customer);
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable String id)
	{
		customerService.deleteCustomer(id);
	}
	
	
}

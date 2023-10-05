package com.pxu.service;

import java.util.List;


import com.pxu.entity.Customer;


public interface CustomerService {

	public void addCustomer(Customer customer);

	public Customer findCustomerByUsername(String username);

	List<Customer> getAllCustomers();

	public Customer getCustomerBycustomerId(long customerId);

	Customer findCustomerByusernameAndpassword(String username, String password);

}

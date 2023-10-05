package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.pxu.entity.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long> {

	Customer findUserByusername(String username);
	
	Customer findCustomerByUsernameAndPassword(String username, String password);

}

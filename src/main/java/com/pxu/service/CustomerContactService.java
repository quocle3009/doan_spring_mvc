package com.pxu.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.pxu.entity.CustomerContact;
@Service
public interface CustomerContactService {

	public void addNewMessage(CustomerContact customerContact);
	
	public void deleteMessageById(long customerContactId);
	
	public List<CustomerContact> getAllCustomerContact();
	
	
	Page<CustomerContact> getAllCustomerMessage(Integer pageNumber);
	
}

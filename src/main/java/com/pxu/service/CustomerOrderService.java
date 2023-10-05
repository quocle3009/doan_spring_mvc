package com.pxu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pxu.entity.Cart;
import com.pxu.entity.CustomerOrder;
@Service
public interface CustomerOrderService {

	public void addCustomerOrder(CustomerOrder customerOrder);

	

	double getCustomerOrderGrandTotal(long cartId);
	
	CustomerOrder getCustomerOrderBycart(Cart cart);
	
	List<CustomerOrder> getAllCustomerOrder();
	
	
	public CustomerOrder getCustomerOrderById(long customerOrderId);
	
	public void deleteCustomerOrderById(long customerOrderId);
	
}

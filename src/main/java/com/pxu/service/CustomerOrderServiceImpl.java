package com.pxu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.repository.CustomerOrderDao;
import com.pxu.entity.Cart;
import com.pxu.entity.CartItem;
import com.pxu.entity.CustomerOrder;
import com.pxu.service.CartService;
import com.pxu.service.CustomerOrderService;

@Service

public class CustomerOrderServiceImpl implements CustomerOrderService {

	@Autowired
	private CustomerOrderDao customerOrderDao;

	@Autowired
	private CartService cartService;

	@Transactional()
	@Override
	public void addCustomerOrder(CustomerOrder customerOrder) {

		Cart cart = customerOrder.getCart();

		CustomerOrder oldCustomerOrder = customerOrderDao.getCustomerOrderBycart(cart);
		if (oldCustomerOrder != null) {

			oldCustomerOrder.setCustomer(cart.getCustomer());
			oldCustomerOrder.setShippingAddress(cart.getCustomer().getShippingAddress());
			oldCustomerOrder.setBillingAddress(cart.getCustomer().getBillingAddress());
			customerOrderDao.save(oldCustomerOrder);

		}

		else {
			customerOrder.setCustomer(cart.getCustomer());
			customerOrder.setShippingAddress(cart.getCustomer().getShippingAddress());
			customerOrder.setBillingAddress(cart.getCustomer().getBillingAddress());

			customerOrderDao.save(customerOrder);
		}

	}

	@Transactional(readOnly = true)
	@Override
	public double getCustomerOrderGrandTotal(long cartId) {

		double grandTotal = 0;
		Cart cart = cartService.getCartById(cartId);

		List<CartItem> cartItems = cart.getCartItems();

		for (CartItem cartItem : cartItems) {
			grandTotal += cartItem.getTotalPrice();
		}

		return grandTotal;
	}

	@Transactional(readOnly = true)
	@Override
	public CustomerOrder getCustomerOrderBycart(Cart cart) {

		return customerOrderDao.getCustomerOrderBycart(cart);
	}

	@Transactional(readOnly = true)
	@Override
	public List<CustomerOrder> getAllCustomerOrder() {

		return (List<CustomerOrder>) customerOrderDao.findAll();
	}

	@Transactional
	@Override
	public void deleteCustomerOrderById(long customerOrderId) {
		customerOrderDao.deleteById(customerOrderId);
	}

	@Transactional(readOnly = true)
	@Override
	public CustomerOrder getCustomerOrderById(long customerOrderId) {
		return customerOrderDao.findById(customerOrderId).orElse(null);
	}

}

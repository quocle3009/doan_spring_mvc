package com.pxu.service;

import java.io.IOException;


import com.pxu.entity.Cart;

public interface CartService {

	public void addCart(Cart cart);

	public Cart getCartById(long cartId);

	Cart validateCustomer(long cartId) throws IOException;
}

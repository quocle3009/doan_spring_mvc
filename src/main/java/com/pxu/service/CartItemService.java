package com.pxu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pxu.entity.Cart;
import com.pxu.entity.CartItem;

@Service
public interface CartItemService {

	public void addCartItem(CartItem cartItem);

	public void deleteCartItem(CartItem cartItem);

	public void removeAllCartItems(Cart cart);

	CartItem getCartItemByProduct(long productId);

	List<CartItem> findAllCartItemsBycart(Cart cart);
}

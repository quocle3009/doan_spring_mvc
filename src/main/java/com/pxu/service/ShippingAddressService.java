package com.pxu.service;


import com.pxu.entity.ShippingAddress;


public interface ShippingAddressService {

	public void addShippingAddress(ShippingAddress shippingAddress);

	ShippingAddress getShippingAddressById(long shippingAddressId);
}

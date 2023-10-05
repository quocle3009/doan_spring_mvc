package com.pxu.service;


import com.pxu.entity.BillingAddress;


public interface BillingAddressService {

	public void addBillingAddress(BillingAddress billingAddress);

	BillingAddress getBillingAddressbyId(long billingAddressId);

}

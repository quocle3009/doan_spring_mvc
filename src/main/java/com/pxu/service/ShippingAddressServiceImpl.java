package com.pxu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.repository.ShippingAddressDao;
import com.pxu.entity.ShippingAddress;
import com.pxu.service.ShippingAddressService;

@Service

public class ShippingAddressServiceImpl implements ShippingAddressService{

	@Autowired
	private ShippingAddressDao shippingAddressDao;
	@Transactional()
	@Override
	public void addShippingAddress(ShippingAddress shippingAddress) {
		
		shippingAddressDao.save(shippingAddress);
		
	}
	@Transactional(readOnly = true)
	@Override
	public ShippingAddress getShippingAddressById(long shippingAddressId) {
	    Optional<ShippingAddress> optionalShippingAddress = shippingAddressDao.findById(shippingAddressId);
	    return optionalShippingAddress.orElse(null);
	}


}

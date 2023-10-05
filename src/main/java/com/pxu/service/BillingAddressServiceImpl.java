package com.pxu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.repository.BillingAddressDao;
import com.pxu.entity.BillingAddress;
import com.pxu.service.BillingAddressService;

@Service
public class BillingAddressServiceImpl implements BillingAddressService {

	@Autowired
	private BillingAddressDao billingAddressDao;

	// persisting and deleting objects requires a transaction in JPA. Thus we need
	// to make sure a transaction is running, which we do by having the method
	// annotated with @Transactional.
	@Transactional()
	@Override
	public void addBillingAddress(BillingAddress billingAddress) {

		billingAddressDao.save(billingAddress);

	}

	@Transactional(readOnly = true)
	@Override
	public BillingAddress getBillingAddressbyId(long billingAddressId) {
		Optional<BillingAddress> optionalBillingAddress = billingAddressDao.findById(billingAddressId);
		return optionalBillingAddress.orElse(null);
	}

}

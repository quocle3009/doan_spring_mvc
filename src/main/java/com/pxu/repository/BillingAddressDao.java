package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.entity.BillingAddress;

@Repository
public interface BillingAddressDao extends CrudRepository<BillingAddress, Long> {

}

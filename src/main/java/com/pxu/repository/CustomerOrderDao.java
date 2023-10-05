package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.entity.Cart;
import com.pxu.entity.CustomerOrder;

@Repository

public interface CustomerOrderDao extends CrudRepository<CustomerOrder, Long>{

	CustomerOrder getCustomerOrderBycart(Cart cart);
}

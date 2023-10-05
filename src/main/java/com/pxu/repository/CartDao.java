package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.entity.Cart;

@Repository
public interface CartDao extends CrudRepository<Cart, Long> {

	Cart findUserBycartId(long cartId);
}

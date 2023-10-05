package com.pxu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pxu.entity.PersistentLogin;
@org.springframework.stereotype.Repository
public interface RememberMeTokenRepository extends CrudRepository<PersistentLogin, Long> {

	PersistentLogin findBySeries(String series);
	List<PersistentLogin> findByUsername(String username);

}

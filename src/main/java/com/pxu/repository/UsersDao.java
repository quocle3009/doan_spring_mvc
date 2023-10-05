package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.entity.Users;

@Repository

public interface UsersDao extends CrudRepository<Users, Long>{

	Users findUserByusername(String username);
}

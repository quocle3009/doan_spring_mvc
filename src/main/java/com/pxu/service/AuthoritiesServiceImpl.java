package com.pxu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pxu.repository.AuthoritiesDao;
import com.pxu.entity.Authorities;
import com.pxu.service.AuthoritiesService;

@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {

	@Autowired
	private AuthoritiesDao authoritiesDao;

	@Transactional()
	@Override
	public void addAuthorities(Authorities authorities) {

		authoritiesDao.save(authorities);
	}

	@Transactional(readOnly = true)
	@Override
	public Authorities findAuthoritiesByusername(String username) {

		return authoritiesDao.findAuthoritiesByusername(username);
	}

}

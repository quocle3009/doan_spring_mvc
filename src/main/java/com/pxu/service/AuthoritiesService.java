package com.pxu.service;


import com.pxu.entity.Authorities;


public interface AuthoritiesService {

	public void addAuthorities(Authorities authorities);

	Authorities findAuthoritiesByusername(String username);
}

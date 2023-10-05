package com.pxu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pxu.entity.CustomerContact;

@Repository
public interface CustomerContactDao extends CrudRepository<CustomerContact, Long>,PagingAndSortingRepository<CustomerContact, Long>{

}

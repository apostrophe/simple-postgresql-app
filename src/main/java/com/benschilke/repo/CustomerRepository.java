package com.benschilke.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.benschilke.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	List<Customer> findByLastName(String lastName);

//	void saveAll(List<Customer> asList);
	
}

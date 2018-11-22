package com.benschilke.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.benschilke.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{

//	List<Customer> findByLastName(String lastName);

//	void saveAll(List<Customer> asList);
	
}

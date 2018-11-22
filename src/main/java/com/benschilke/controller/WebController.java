package com.benschilke.controller;

import java.util.Arrays;

import javax.validation.ReportAsSingleViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.benschilke.model.Customer;
import com.benschilke.model.Department;
import com.benschilke.repo.CustomerRepository;
import com.benschilke.repo.DepartmentRepository;

@RestController
public class WebController {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@RequestMapping("/save")
	public String process() {
		
		Department salesDept = new Department("SALES");
		departmentRepository.save(salesDept);
		Department serviceDept = new Department("SERVICE");
		departmentRepository.save(serviceDept);
		
		// save a single Customer
		customerRepository.save((Customer)new Customer("Jack", "Smith", salesDept));
		
		// save a list of Customers
		customerRepository.saveAll(Arrays.asList(
				new Customer("Adam", "Johnson", salesDept), 
				new Customer("Kim", "Smith", serviceDept),
				new Customer("David", "Williams", serviceDept), 
				new Customer("Peter", "Davis", salesDept)
				));
		
		return "Done";
	}
	
	@RequestMapping("/findAll")
	public String findAll() {
		String result = "";
		
		for (Customer c : customerRepository.findAll())
			result += c.toString()+"<br />";
		
		return result;
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = customerRepository.findById(id).toString();
		return result;
	}
	
	@RequestMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName){
		String result = "";
		
		for(Customer cust: customerRepository.findByLastName(lastName)){
			result += cust.toString() + "<br>"; 
		}
		
		return result;
	}
}

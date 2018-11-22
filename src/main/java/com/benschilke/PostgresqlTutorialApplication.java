package com.benschilke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.benschilke.repo.CustomerRepository;

/**
 * 
 * based on tutorial: https://grokonez.com/spring-framework/use-spring-jpa-postgresql-spring-boot
 *
 */

@SpringBootApplication
public class PostgresqlTutorialApplication implements CommandLineRunner {
	
	@Autowired
	CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlTutorialApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// clear all record if existed before do the tutorial with new data 
		repository.deleteAll();
	}
}

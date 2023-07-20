package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findById(long id);

	void deleteById(long id);

}

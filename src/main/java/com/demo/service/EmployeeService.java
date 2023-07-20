package com.demo.service;

import java.util.List;

import com.demo.dto.EmployeeResponseVo;
import com.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	EmployeeResponseVo getById(long id);
	
	String saveStudent(Employee emp);
	
	String updateByEmploee(Employee emp , long id);
	
	String deleteByID(long id);

}



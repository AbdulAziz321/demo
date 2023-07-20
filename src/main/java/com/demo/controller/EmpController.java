package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.EmployeeResponseVo;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmpController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<EmployeeResponseVo> getById(@PathVariable long id) {
		EmployeeResponseVo employeeResponseVo = employeeService.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponseVo);
	}
}

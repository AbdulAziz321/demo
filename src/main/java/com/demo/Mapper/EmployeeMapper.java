package com.demo.Mapper;

import com.demo.dto.EmployeeResponseVo;
import com.demo.model.Employee;

public class EmployeeMapper {

	public static EmployeeResponseVo employeeEntityToEmployeeDto(Employee employee) {
		EmployeeResponseVo employeeResponceVo = new EmployeeResponseVo();
		employeeResponceVo.setId(employee.getId());
		employeeResponceVo.setName(employee.getName());
		employeeResponceVo.setSalary(employee.getSalary());

		return employeeResponceVo;
	}

	public static Employee employeeDtoToEmployeeEntity(EmployeeResponseVo employeeResponceVo) {
		Employee employee = new Employee();
		employee.setId(employeeResponceVo.getId());
		employee.setName(employeeResponceVo.getName());
		employee.setSalary(employeeResponceVo.getSalary());

		return employee;
	}

}

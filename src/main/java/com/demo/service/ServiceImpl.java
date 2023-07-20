package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.Mapper.EmployeeMapper;
import com.demo.dto.EmployeeResponseVo;
import com.demo.model.Employee;
import com.demo.repository.EmployeeRepo;

@Service
public class ServiceImpl implements EmployeeService {

	@Value("${demo.user.notfound.code}")
	private  String userNotFoundCode;

	@Value("${demo.user.notfound.message}")
	private  String userNotFoundMessage;

	@Autowired
	private EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public EmployeeResponseVo getById(long id) {
		Optional<Employee> employeeOptional = repo.findById(id);
		if (employeeOptional.isPresent()) {
			Employee employee = employeeOptional.get();
			return EmployeeMapper.employeeEntityToEmployeeDto(employee);
		}
		EmployeeResponseVo employeeResponseVo = new EmployeeResponseVo();
		employeeResponseVo.setErrCode(userNotFoundCode);
		employeeResponseVo.setErrDesc(userNotFoundMessage);
		return employeeResponseVo;

	}

	public String saveStudent(Employee emp) {
		repo.save(emp);
		return "Save Successfully";
	}

	@Override
	public String updateByEmploee(Employee emp, long id) {
		Optional<Employee> emp1 = repo.findById(id);
		if (emp1.isEmpty() || emp1 == null || !emp1.isPresent()) {
			return null;
		} else {
			repo.save(emp);
			return "Updated";
		}
	}

	@Override
	public String deleteByID(long id) {
		Optional<Employee> emp1 = repo.findById(id);
		if (emp1.isEmpty() || emp1 == null || !emp1.isPresent()) {
			return null;
		} else {
			repo.deleteById(id);
			return "Deleted";
		}
	}

}

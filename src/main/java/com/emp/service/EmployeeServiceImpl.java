package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee saveEmployee = emeployeeRepository.save(employee);
		return null;
	}
	
}

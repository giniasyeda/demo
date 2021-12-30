package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.EmployeeEntity;

public interface EmployeeService {

	public Integer saveEmployee(EmployeeEntity entity);

	public List<EmployeeEntity>  getAllEmployee();

	public Optional<EmployeeEntity> getEmployeeById(Integer id);

	public EmployeeEntity updateEmployee(EmployeeEntity entity);

	public void deleteEMployee(Integer id);

	public Optional<EmployeeEntity> getEmployeeByName(String name);

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/save")
	public Integer saveEmployeeData(@RequestBody EmployeeEntity entity) {
		Integer saveEmployee = service.saveEmployee(entity);
		return saveEmployee;

	}

	@GetMapping(path = "/list")
	public List<EmployeeEntity> getAllEmployeeData() {
		List<EmployeeEntity> allEmployee = service.getAllEmployee();
		return allEmployee;

	}

	@GetMapping(path = "/{id}")
	public Optional<EmployeeEntity> getEMployeeDetailBYId(@PathVariable Integer id) {
		return service.getEmployeeById(id);

	}

	@PutMapping("/update")
	public EmployeeEntity updateEmployeeData(@RequestBody EmployeeEntity entity) {
		EmployeeEntity updateEmployee = service.updateEmployee(entity);
		return updateEmployee;

	}
	@DeleteMapping("/{id}")
	public String deleteEmployeeData(@PathVariable Integer id) {
		service.deleteEMployee(id);
		return "Employee Record Deleted....!!!";
		
	}
	@GetMapping(path = "/get/{byName}")
	public  Optional<EmployeeEntity> getEmpDetails(@PathVariable String byName) {
		Optional<EmployeeEntity> employeeByName = service.getEmployeeByName(byName);
		return employeeByName;
		
	}

}

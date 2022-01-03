package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(EmployeeEntity entity) {
		return repo.save(entity).getId();

	}

	@Override
	public List<EmployeeEntity> getAllEmployee() {
		List<EmployeeEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Optional<EmployeeEntity> getEmployeeById(Integer id) {
		Optional<EmployeeEntity> findById = repo.findById(id);
		return findById;
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity entity) {
		Optional<EmployeeEntity> findById = repo.findById(entity.getId());
		EmployeeEntity entity1 = new EmployeeEntity();
		entity1.setId(findById.get().getId());
		entity1.setAddress(entity.getAddress());
		entity1.setName(entity.getName());
		entity1.setSalary(entity.getSalary());
		entity1.setCompanyName(entity.getCompanyName());
		repo.save(entity1);
		return entity1;

	}

	@Override
	public void deleteEMployee(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Optional<EmployeeEntity> getEmployeeByName(String name) {
		return repo.findByName(name);
	}

}

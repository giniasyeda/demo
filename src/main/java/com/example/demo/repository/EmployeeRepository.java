package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	@Query("select e from EmployeeEntity e where e.name=:name")
	public Optional<EmployeeEntity> findByName(String name);

}

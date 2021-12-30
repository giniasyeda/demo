package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE_TABLE")
@Data
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_ID")
	private Integer id;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "EMP_ADDRES")
	private String address;
	@Column(name = "EMP_SALARY")
	private Double salary;

}

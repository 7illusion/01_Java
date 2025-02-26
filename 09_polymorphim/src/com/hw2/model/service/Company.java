package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private Employee[] employees ; //= new Employee[] ; //전체 직원 저장용
	private int employeeCount ;
	
	public Company(int size) {
		employees[size] = new Employee(null, null, null);
		setEmployeeCount(0);
	}
	

	
	public Employee[] getEmployee() {
		return employees;
	}

	public void setEmployee(Employee[] employee) {
		this.employees = employee;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	@Override
	public void addPerson(Person person) {
		
		
	}
	@Override
	public void removePerson(String id) {
		if(id.equals(getEmployee())) {
			 
		}

		
		
	}
	@Override
	public void displayAllPerson() {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
	
	

}

package com.hw1.model.vo;

public class Employee extends Person{
	private int salary ;
	private String dept ;
	
	public Employee() {	}


	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.name = name ; //protected 는 직접 접근 person이 부모이기에 가능 
		this.salary = salary;
		this.dept = dept;
	}


     @Override
	public String information() {
		
		return  super.information() + " / 급여 : " + salary + " / 부서 : " + dept ;		
	}          //person information 을 말함 



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}

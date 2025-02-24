package com.hw1.model.vo;

import java.util.Arrays;

public class Employee {
	
	private int empNo ; //사원번호
	private String empName ;
	private String dept ; //소속부서 
	private String job ;
	private int age ;
	private char gender ;
	private int salary ; //급여
	private double bonusPoint ; //보너스 포인트
	private String phone ;
	private String address ;
	
public Employee() {} //기본 생성자


public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
	this.empNo = empNo;
	this.empName = empName;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
	this.address = address;
}


public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
		String phone, String address) {
	this.empNo = empNo;
	this.empName = empName;
	this.dept = dept;
	this.job = job;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
	this.bonusPoint = bonusPoint;
	this.phone = phone;
	this.address = address;
}

public void information() {
	Employee[] empArr = new Employee[3] ;
	empArr[0] = new Employee();
	empArr[1] = new Employee(1,"홍길동",null,null,19,'M',0,0.0,"01022223333","서울잠실");
	empArr[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울마곡");
	
    for (int i = 0; i < empArr.length; i++) {
    	
	    System.out.println(empArr[i].toString());
    }
    
	System.out.println("\n==========================================");

	empArr[0] = new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
	empArr[1] = new Employee(1,"홍길도","기획부","부장",19,'M',4000000,0.3,"01022223333","서울잠실");
	
	System.out.println(empArr[0].toString());
	System.out.println(empArr[1].toString());

	System.out.println("\n==========================================");
	
    int sum2 = 0 ;
	double sum = 0 ;
	for (int i = 0; i < empArr.length; i++) {
		sum = (((double)empArr[i].getSalary() + ((double)empArr[i].getSalary() * empArr[i].getBonusPoint()))*12) ;
		sum2 += sum ;
		System.out.println(empArr[i].getEmpName()+"의 연봉 : " + (int)sum);
	}
	System.out.println("\n==========================================");
	
	System.out.println("직원들의 연봉의 평균 : " + sum2/3);
	
	
	
	
	
}


public int getEmpNo() {
	return empNo;
}

public void setEmpNo(int empNo) {
	this.empNo = empNo;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public double getBonusPoint() {
	return bonusPoint;
}

public void setBonusPoint(double bonusPoint) {
	this.bonusPoint = bonusPoint;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "emp[" + empNo + "]" + " : " + empName + ", " + dept + ", " + job + ", " + age
			+ ", " + gender + ", " + salary + ", " + bonusPoint + ", " + phone
			+ ", " + address ;
}




}

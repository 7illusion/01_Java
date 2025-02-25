package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	
	public void ex1() {
		Person p = new Person() ; 
		
		p.setName("홍길동");
		p.setAge(22);
		p.setNationality("한국");

		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		//person을 상속받은 student 가 정말로 부모의 필드 메서드를 사용해보기

		System.out.println("===================");
		
		Student std = new Student();
		//고유 멤버
		std.setGrade(2);
		std.setClassRoom(4);
		
		//person 클래스로부터 상속받은 멤버 
		std.setName("고길동");
		std.setAge(21);
		std.setNationality("일본");
		
		System.out.println(std.getClassRoom());
		System.out.println(std.getGrade());
		System.out.println(std.getNationality());
		
		System.out.println("===================");
		
		Employee emp = new Employee();
		
		emp.setCompany("아이드");
		emp.setName("진짜");
		emp.setNationality("주스");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getNationality());
		System.out.println(emp.getName());
		
		p.breath();
		p.move();
		
		std.breath();
		std.move();
		
		emp.breath();
		emp.move();
		
		//상속의 특징 
		//코드길이 감소 및 중복제거 효과 
		
		
	}

	
	public void ex2() {
		//super 생성자 이용 
		//student 객체 생성 
		Student std = new Student("홍길동",22,"한국",5,4);

		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getClassRoom());
		System.out.println(std.getGrade());
		
		Employee emp = new Employee("김노동",30,"한국","KH정보교육원");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
	}
	
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		
		emp.move(); //emp에 있는것만 현재 오버라이딩 해서 이것만 다르게 나옴 
		std.move(); //std는 오버라이딩 x 
		
	}
	
	public void ex4() { // toString 오버라이딩 예제
		
		Person p = new Person("김철수" , 17 , "한국");
		
		System.out.println(p.toString());
		System.out.println(p); //프린트 구문 수행시 참조변수명을 작성하면 자동으로 toString 메서드를 호출해서 출력해준다 
		
		System.out.println("=============================");
		
		Student std = new Student("강호동",34,"미국",3,5);
		System.out.println(std.toString());
		
		Employee  emp = new Employee("김노동",30,"한국","KH정보교육원"); 
		
		System.out.println(emp.toString());
		
	}
}

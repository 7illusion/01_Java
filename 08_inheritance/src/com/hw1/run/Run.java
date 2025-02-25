package com.hw1.run;

import java.util.Iterator;
import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Student[] arr = new Student[3];
		arr[0] = new Student("홍길동",20,178.2,70,1,"정보시스템광학과");
		arr[1] = new Student("김말똥",21,187.3,80,2,"경영학과");
		arr[2] = new Student("강개순",23,167.0,45,4,"정보통신공학과");
		
		//향상된 for 문 가독성 좋아짐 더 간결해짐 for(데이터타입 변수명 : 배열 또는 컬렉션)
		for (Student i : arr) {
			System.out.println(i.information()); //변수명은 자기가 마음대로 정하는거고 배열이라면 arr[]처럼 쓰인다  
		}
		
		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i].information()); }
		 */
		System.out.println("=============================================");
		
		Employee[] arr2 = new Employee[10];
		
		int count = 0 ;
		
		while (true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			
			System.out.print("부서 : ");
			String dept  = sc.next();
			
			arr2[count] = new Employee(name ,age ,height ,weight , salary ,dept);// 새로운 객체 생성 
			
			count ++ ;
			
			if(arr.length == count) {
				break ;
			}
			

			System.out.print("계속 추가할래 (y/n) : ");
			String yorn = sc.next().toUpperCase(); // 소문자로 들어와도 대문자로 자동으로 바뀌줌 
			
			//if(yorn.equalsIgnoreCase("N")) break ; 또다른 방법 toUpper 가 없을떄 			
			if (yorn.equals("N")) {
				break ;
			}
			
			
		}
		for (Employee emp : arr2) {
			// 만약에 emp가 null 이면 반복 종료 그래야지 오류가 안남 null exception 일어남 
			if(emp == null) break ;
			
			System.out.println(emp.information());
		}
		//System.out.println(arr2[count].information());
		
	}

}

package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비지니스 로직)을 제공하는 패키지 or 서비스 
//(비밀번호 -> 암호화, 파일 -> 유효한 파일 걸러내는 작업...)
public class AbstactionService {
	//속성과 기능은 필요 없다면 넣을 필요가 없다 
	//메소드 안쪽에 생기는 변수는 스택에 생김 
	public void ex1() {
		//people 클래스를 이용해서 국민 객체 만들기 
		People p1 = new People();
		//People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1==참조변수
		// new People 객체를 Heap 영역에 생성 
		
//클래스 이름이 자료형처럼 사용된다 -> 클래스를 "사용자 정의 자료형" 이라고 부른다 
		
		// 변수에 접근할 떄 변수명. -> 직접접근  
	
		/*
		 * p1.name = "홍길동" ; p1.gender = '남'; p1.pNumber ="123456-1234567"; p1.address =
		 * "서울시 중구 남대문로 120"; p1.phone = "010-1234-1234" ; p1.age = 20 ;
		 */
		
		/* private 으로 설정이 되어 직접 접근 불가 
		 * System.out.println("p1의 name : " + p1.name);
		 * System.out.println("p1의 gender : " + p1.gender);
		 * System.out.println("p1의 pNumber : " + p1.pNumber);
		 * System.out.println("p1의 phone : " + p1.phone);
		 * System.out.println("p1의 age : " + p1.age);
		 */ 
		p1.tax();
		p1.vote();
		
		// 전달하는 값(인자) : 전달인자 
        p1.setName("홍길동");//전달해서 다시 return 
		System.out.println(	p1.getName()); //gerName을 해야지 홍길동이 나옴
			
		p1.setGender('남'); // 전달 
		System.out.println(p1.getGender());
		
		p1.setAge(20); // 전달 
		System.out.println(p1.getAge());
		
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-1234");
		p1.setpNumber("123456-1234567");
		
		System.out.println(p1.getAddress() );
		System.out.println(p1.getPhone());
		
	
	}
	
	public void ex2() {
		People p2 = new People();
		
		p2.setName("박기춘");
		p2.setGender('남');
		p2.setpNumber("991002-1234567");
		p2.setAddress("부천시 부흥로 100");
		p2.setPhone("010-8430-7278");
		p2.setAge(27);
		
		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		System.out.println(p2.getpNumber());
		System.out.println(p2.getAddress());
		System.out.println(p2.getPhone());
		System.out.println(p2.getAge());
		
	}
	

}

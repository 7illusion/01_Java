package edu.kh.oop.abstraction.model.vo;

//MVC 패턴 model - 데이터와 비지니스 로직을 처리하고 저장하는용도 (DB,서비스,객체) 
           //view - 사용자에게 보여지는 UI -HTML,JSP,Thymeleaf,React 
     // controller - 사용자의 요청을 받고 ,모델과 뷰를 연결하는 역할 (응답) 
//-> 애플리케이션의 역할을 세가지로 분리하는 설계 패턴 

// vo = value object : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지 model 에 포함됨 

//
public class People {//국민(사람) 클래스 
	
	//클래스란? 객체의 특성(속성과 기능)을 정의한 것 
	//== 객체를 만들기 위한 설계도 
	
	//속성 == 값 == date : 값을 저장하기 위한 변수 선언 
	//국민이라면 공통적으로 가지고 있는 속성만 작성 (추상화)
	//이름,나이,성별,주민번호,주소,전화번호
	
	//캡슐화 -데이터와 기능을 하나로 묶어서 관리하는 기법 
	//데이터의 직접적인 접근을 제한하는 것이 원칙
	// ->직접접근 못하기 때문에 
	//클래스 내부에 간접접근 방법을 제공하는 기능(메서드) 작성해둔다.
	//-> getter / setter 
	
	/*데이터 직접 접근 제한 
	 * 
	 * public 이 아니 private 로 작성 
	 * 
	 * */
	
	//필드 == 필드변수 == 멤버변수 -> private을 원칙 
	//접근제한자 자료형 변수명 ;
	private String name ; 
	private char gender ;  // 유니코드에서 0은 null 아니라 공백이다 
	private String pNumber ;
	private String address;
	private String phone ;
	private int age ; 
	//public double bitcoin; 공통점이 아니므로 제거 -> 추상화 중 
	
	//기능 == 행동/동작 == 메서드(method) 
	public void tax( ) {
		System.out.println("세금을 내다");
	}
	
	public void vote() {
		System.out.println("투표를 합니다 반드시");
	}
	
	// alt + shift + s -> getters and setters 클릭 
	//getter 와 setter을 자동 완성으로 만들어줌 

	public String getName() {
		return name; //return 은 name  반환 
	}

	public void setName(String name) {
		this.name = name;  //this 은 p1 이나 p2 에 있는 name이라는 필드에 작성됨
		                   //오른쪽 name 은 매개변수이다 
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {	
		//메서드 (기능) 형태인 getter/setter 를 이용하면 본인이 원하는 기능을 추가 가능
		if (age > 0) {
		this.age = age;
		}else {
			throw new IllegalArgumentException("음수 불가");//음수를 받으면 출력 
			//메서드에 전달된 인자가 (매개변수) 유효하지 않을 떄 발생하는 예외
		}
	}
	
	//캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	//접근제한자 반환형 메서드명() {}
	//name 변수의 값을 호출한 쪽으로 돌려
	 //보내주는 간접 접근 기능 중 getter
	//getter setter 은 무조건 public 이다 
	
	//void : 반환할 값이 없다 
	/*
	 * public String getName() { return name ; //return : 현재 메서드를 종료하고 호출한쪽으로 되돌아감
	 * //return 값/변수 ; : 현재 메서드를 종료하고 값/변수 // 가지고 호출한쪽으로 되돌아감 } //getter() : 반환형이
	 * 무조건 있음 // getter는 필드에 작성된 변수값을 호출한쪽으로 되돌려주는 것 // 변수는 자료형이 있을 것 그변수를 되돌려준다면
	 * 당연히 반환형도 존재할 것
	 * 
	 * 
	 * // name 변수에 값을 세팅하는 간접 접근 기능 중 setter //매개변수 -> String name 매개변수는 필드명이랑 똑같이 씀
	 * 보통 public void setName(String name) { this.name = name ; //this 는 현재 개체의 필드
	 * 이름 }
	 * 
	 * public char getGender() { return gender ; } public void setGender(char
	 * gender) { this.gender = gender ; }
	 * 
	 * 
	 * public String getpNumber() { return pNumber ; } public void setpNumper(String
	 * pNumber) { this.pNumber = pNumber ; }
	 * 
	 * 
	 * public String getAddress() { return address ; } public void setAddress(String
	 * address) { this.address = address ; }
	 * 
	 * public String getPhone() { return phone ; } public void setPhone(String
	 * phone) { this.phone = phone ; }
	 * 
	 * public int getAge() { return age ; } public void setAge(int age) { this.age =
	 * age ; }
	 */
	
	
	// 나의 정보를 가지고 객체 생성하고 출력 
	
	
	
	
	

}

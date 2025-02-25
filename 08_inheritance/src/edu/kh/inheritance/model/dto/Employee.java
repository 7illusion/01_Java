package edu.kh.inheritance.model.dto;

public /*final*/ class Employee extends Person{ // ->final을 정의하면 상속이 불가 하다 부모클래스 불가 
	
	private String company;
	
	public Employee() {}


	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	//person으로 부터 상속받은 메서드 중 
	//move 메서드를 employee 에 맞게 재정의 == 오버 라이딩 이름 자료형 같아야하고 범위는 최대한 넓게 잡아야한다
	@Override // 오버라이딩 할때 꼭 있어야하며 컴파일 할 떄 알려주는 역할 
	//-> 부모에게 해당 메서드가 있는지 체크 이름, 매개변수 타입과 개수, 순서가 일치하는 여부 검사 
	public void move() {
		System.out.println("오버라이딩된 move");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}

	
	@Override
	public String toString() {
		
		return super.toString() + " / " + company ;
	}
	
	public final void onlyEmployee() { // -> 만드는 이유 변하면 안되는 경우 상속이 안됨 
		System.out.println("final 메서드입니다");
		
	}

}

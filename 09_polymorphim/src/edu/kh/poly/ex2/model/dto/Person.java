package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{

	private String name ; 
	
	public Person() {}
	
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//alt + shift + s override... 선택  오버라이딩 강제화 추상클래스를 상속 받기 위해서는 무조건 필요 
	@Override
	public void eat() {
System.out.println("숟가락,젓가락 등 도구를 이용하여 먹는다");		
	}

	@Override
	public void breath() {
System.out.println("코와 입으로 숨쉰다");		
	}

	@Override
	public void move() {
System.out.println("두발로 걷는다");		
	}

	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name ;
	}
}

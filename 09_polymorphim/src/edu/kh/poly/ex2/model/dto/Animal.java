package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	// 추상 클래스임 
	//1. 미완성 메서드(추상 메서드)를 보유하고 있음
	//2.객채로 만들 수 없는 클래스 
	// -> 여러타입들을 관리하기 위한 상위 타입의 목적 
	//객체로 생성하여 사용하기 위한 목적 x 
	private String type ; //종 
	private String eatType ; //식성

	public Animal() {}
	
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

 
	//동물의 공통 기능 추출 / 어떤 동물이냐에 따라 그 방법이 다름 
	//-> 해당 클래스에 메서드 정의를 자세히 할 수가 없다 
	//미완성 상태로 만들어 상속받은 자식이 해당메서드를 
	//자식 본인에게 맞는 정의를 하도록 오버라이딩 강제화 시킴 
	// -> 추상화 메서드 작성 
	
	//먹다 추상
	public abstract void eat() ;  // 클래스도 abstract 을 붙여야함 
	
	//숨쉬다 추상
	public abstract void breath();
	
	//움직이다 추상
	public abstract void move(); 
	
	//추상 클래스는 일반멤버 필드 ,메서드 작성 가능 
	public void ex() {
		System.out.println("이 메서드는 평범한 메서드이다");
	}

	@Override
	public String toString() {
		return  type + " / " + eatType ;
	}
	
	
	
	


}

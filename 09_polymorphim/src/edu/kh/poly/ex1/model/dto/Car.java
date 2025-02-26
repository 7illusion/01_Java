package edu.kh.poly.ex1.model.dto;

public class Car {
	
	private String engine ; //엔진
	private String fuel ;  //연로
	private int wheel ;  //바퀴개수
	
	public Car() {	}

	public Car(String engine, String fuel, int wheel) {
		super(); //super 의 기본 생성자는 object 를 말함 
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	//object.toString 오버라이딩 
	//오버라이딩 재정의 부모클래스에서 정의된 메서드를 자식클래스에서 재정의하는것 
	@Override
	public String toString() {
		return engine + " / " + fuel + " / " + wheel ;
	}
	//super.toString(); //super의 참조변수(주소값을 가지고 있는것) 현재는 object 라서 주소만 나올거임 

	
}

package edu.kh.poly.ex2.model.service;

public interface TestInterface {
	
	int plus (int num1 ,int num2);
	String str ();  // 상속받는 클래스에 오버라이딩 만 해주면 오류 없이 가능하다 
	
	default void display() {
		System.out.println("test_display");
	}
	
}

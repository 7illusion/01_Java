package edu.kh.poly.ex2.model.service;

//처음 만들떄 부터 인터페이스로 만들 수 있음
//계산기 인터페이스  -< 모든 계산기에 대한 공통 필드 ,기능명을 제공하는 접점(interface)의 용도
public interface Calculator { 
	//인터페이스 : 추상클래스의 변형체 (비슷하지만 더 추상도 높음)
	//- 추상클래스 : 일부만 추상메서드 
	//- 인터페이스 : 모두 추상메서드
	
	//필드는 묵시적으로 public static final => 상수를 뜻함
	public static final double PI = 3.14 ;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0 ;  // 묵시적으로 앞에 생략된 public 부분이 있는거임 
	
	//기능 
	//메서드는 묵시적으로 public abstract 가 있음 
	public abstract int plus(int num1 , int num2) ;
	
	int minus (int num1 ,int num2) ;
	
	public int multiple (int num1 ,int num2) ;
	
	int divide(int num1 , int num2) ;
	
	default void display() {
		System.out.println("cal_display");
	}
	
	
	
	

}

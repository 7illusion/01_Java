package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
		Box<String> stringBox = new Box<String>();
//String 타입으로 Box객체 생성  < >안에는 객체, 참조형만 들어올 수 있다
		//T 가 String 대체됨 
		//필드도 String 타입
		//getter/setter 에서 사용되는 타입도 String 
		
		stringBox.setItem("제네릭"); // String 형을 넣어 줘야함 setter 넣어주고 
		System.out.println(stringBox.getItem()); // getter 로 가져옴  또한 마찬가지
		
	    Box<Integer> intBox = new Box<>();  //우변 타입은 생략 가능 자바7 부터 다이아몬드 연산자 : 컴파일러가 추론해서 넣어줌
	
	    intBox.setItem(23);
	    System.out.println(intBox.getItem());
	
	    //제네릭은 객체(Reference Type)만 허용 
	    //-> 제네릭은 기본자료형(primitive type) int char double 은 불가 
	    //Wrapper 클래스를 사용 하면 가능 
	    /*
	     * byte Byte
	     * short Short 
	     * int Integer
	     * long Long
	     * float Float
	     * double Double
	     * char Character
	     * boolean Boolean    
	     * 
	     * 제네릭 사용 할때 넣어 줄 수 있음 
	     * 
	     * */
	    
	    int num = 10 ;
	    Integer num2 = num ; //오토박싱  기본형 -> 래퍼클래스 자동변환
	    Integer num1 = 10 ;
	    
	    int num3 = num2 ;  // 오토 언박싱 래퍼클래스 -> 기본형 자동변환 
	    
	    int number = Integer.parseInt("100"); 
	}
	
	

}

package edu.kh.exception.model.service;

public class UserException extends Exception { //사용자 정의 예외 클래스 
	
	public UserException() {}
	
public UserException(String message) { // 매개변수 생성 
	super(message);
}	

}

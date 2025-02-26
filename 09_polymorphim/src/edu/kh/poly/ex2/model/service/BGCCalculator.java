package edu.kh.poly.ex2.model.service;

public class BGCCalculator implements Calculator,TestInterface{  //extends , implements 의 차이 
//부(클래스) 자식(클래스)면 extends / 부(인터페이스)- 자(인터페이스) extends / 부(인터페이스 ) -자(클래스 ) implements 


@Override
public int plus(int num1, int num2) {

	return num1 + num2;
}

@Override
public int minus(int num1, int num2) {
	return num1 - num2;
}

@Override
public int multiple(int num1, int num2) {
	return num1 * num2;
}

@Override
public int divide(int num1, int num2) {
	return num1 / num2;
}

@Override
public String str() {
	// TODO Auto-generated method stub
	return null;
}


// 다중 상속 중인 인터페이스들에 같은 디폴트 메서드가 겹치면
//오류 발생!
// => 구현 클래스에서 오버라이딩 반드시 해야함 
@Override
public void display() {
	// TODO Auto-generated method stub
	Calculator.super.display();
}



}

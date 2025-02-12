package edu.kh.op.ex; 

// 실행용 클래스 (메인메서드 존재)
public class ExampleRun {
	
	public static void main(String[] args) {
	
		
	OpExample opEx = new OpExample();
	//패키지가 같기 때문에 import 할 필요 없음
	// OpExample 이라는 클래스(설계도)를 이용해서
	//객체를 생성하는데 , 그 객체 이름이 opEx다
	opEx.ex1(); // ctrl + 클릭 하면 정의된 클래스로 이동
	// opEx가 가지고 있는 기능(메서드) 중 ex1 이름의
	//메서드를 호출(실행)
	
	opEx.ex2();
	
	opEx.ex3();
	
	opEx.ex4();
	
	opEx.test();
	}

}

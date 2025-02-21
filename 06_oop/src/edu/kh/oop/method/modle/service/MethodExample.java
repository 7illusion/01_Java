package edu.kh.oop.method.modle.service;

public class MethodExample {
	
	public void method1() {
		
		//메서드가 호출될떄마다 stack에 메서드를 실행한 이력이 쌓인다.
		//->메서드를 호출한 순서대로 쌓임.
		
		//main -> method1 -> method2 
		//그리고 제일 마지막에 쌓인 순서대로 스택에서 나감 
		//LIFO 마지막에 들어온게 첫번쨰로 나간다 == 후입선출 
		// method2 -> method2 -> main
		
		int result = method2(3,5); //method2() 함수 호출 
		System.out.println(result);
		//void 는 기본적으로 return 을 가지고 있고 생략된 형태이다 
		//호출한 곳으로 (코드 흐름이) 되돌아감
	}

	public int method2(int a , int b) {  
	   int sum = a+b ; 
	   return sum ; // 리턴 값이 int 
	   
	   //method2() 호출한쪽으로 sum(8)을 가지고 
	   //(코드 흐름이) 되돌아감 
	}
	
}

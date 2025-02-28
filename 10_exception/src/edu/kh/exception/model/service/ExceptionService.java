package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService { // 예외 처리되는 경우
	//예외 Exception 개발자의 소스코드 수정으로 해결 가능한 오류 
	//예외는 2개의 종류가 있다 
	//1. unchecked Exception :선택적으로 예외 처리
	//2. checked Exception : 필수적으로 예외처리해줘야함
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//두 정수를 입력받아 나누기한 몫을 출력 

		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();   // 예외 -> 만약 입력을 int가 아닌 String ,char ,double 같은 다른 자료형이 대입 했을 경우 
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		
		if(input2 != 0) {
			System.out.println("결과 : " + input1/input2);
			//input2 에 0이 들어왔을때 0으로 나눌 수 없다 : 산술적 예외 발생 
			
		}else {
			System.out.println("infinity");
		}
		
		//==============================
		
		try {
			//예외가 발생할것같은 코드
			System.out.println("결과 : " + input1/input2);
		}catch(ArithmeticException e) {
			//try 에서 던져진 예외를 catch 문의 매개변수 e로 잡음
			//e 를 사용하여 예외 추적코드 작성할수도 있음
			System.out.println("infinity");
			e.printStackTrace();
			//발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			//예외 발생지점 추적 메서드
		}
		
		//발생하는 예외 중 일부 예외 try catch 사용 안해도 
		//if else 문으로 에외 상황 방지 가능 
		//unchecked Exception 은 try 해주는게 좋음
		
	}

	
	public void ex2() {
		//여러가지 예외에 대한 처리방법 
		
		try {

			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();  
			
			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1/input2);
			
			String str = null ; 
			
			System.out.println(str.charAt(0));
			
			//inputMismatch , Arithemetic 둘다 RunTimeException 후손 
			//runtime 은 Exception 후손
			//Exception - RunTime - inputMismatch , Arithemetic
		}
		// 캐치 상단 런타입예외를 잡아 버리면 아래의 하위객체들이 예외를 잡을게 없기 떄문에 다형성 관계를 보고 입력 
		catch(InputMismatchException e) {
			System.out.println("타입이 맞지 않음");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}catch(RuntimeException e) {
			System.out.println("sork cjfl goTdmsl dkstlagkfkrh!");
		}catch(Exception e) {
			// Exception 은 모든 예외를 다 캐치 할 수 있음 
			//다형성 - 업캐스팅: 부모타입이 참조변수로 자식개체 참조 
			
			// 상위 타입의 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모두 잡아서 처리 가능 
			System.out.println("모든 예외를 처리 해줌 뭔지는 모르지만");
			e.printStackTrace(); // 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력 
		}
	}

	
	public void ex3() {
		//try -catch -finally 에외가 발생 안해도 finally 는 무조건 수행
		
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();  
			
			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1/input2);
			
			
		}catch(ArithmeticException e) {
			System.out.println("산술적 예외 처리가 됨");
			System.out.println(e.getClass()); // 어떤 예외 클래스인가?? class java.lang.Ari ....
			System.out.println(e.getMessage()); //예외 발생시 출력된 내용 / 영어로 0으로 나눠서 라고 나옴...
			System.out.println(e); // toString 출력 java.lang.ArithmeticException: / by zero
			e.printStackTrace();  // 앞에 있는 내용을 한번에 합쳐서 보여줌 
		}catch(InputMismatchException e) {
			System.out.println("자료형이 안맞음");
			System.out.println(e);
			e.printStackTrace();
		}
		finally {//예외 발생 하든지 말든지 무조건 실행 
			System.out.println("anwhrjs anwhrjsdldi WKsWKsWKs");
			//스캐너를 썻다면 close를 사용하여 메모리 누수 방지를 해준다 
			sc.close();
		}
	}
	
	
	public void ex4() {
		
		try {
			methodA();
		}catch(IOException e) { // or Exception e 로도 가능
		
			System.out.println("method에서부터 발생한 예외를 처리함");
			
		}
		
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	public void methodB() throws IOException{
		methodC();
	}
	public void methodC() throws IOException { //throws 호출한 메서드에게 예외를 던짐 ->호출한 메서드에게 예외처리를 하라고 던짐 
		//throw 로 예외 강제 발생 
		throw new FileNotFoundException() ; //checked Exception 이기 떄문에 컴파일에서 에러가 잡힘 
		                           // IOE 가 상위객체고 FileNo 는 하위 객체이기 때문에 업캐스팅으로 오류가 발생하지 않음
	}
	
	
	public void ex5() throws UserException {
		//사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기 
		throw new UserException("사용자 정의 예외 정의"); // Exception 을 상속을 받음  checked 라서 던지든 try 해주든 처리 해줘야함
		
		
	}
	
	
	
}

package edu.kh.variable.ex2;

import java.util.Scanner;

//import : 다른 패키지에 존재하는 클래스를 얻어오는 구문 
//Scanner Class 설계도를 가져옴 


public class ScannerExample {

	public static void main(String[] args) {

		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 잇게하는 역할
		
		//Scanner 객체 생성 
		
		Scanner sc = new Scanner(System.in);
		//import 구문이 없으면 설꼐도가 없는것과 같아서 기계를 만들수 없음
		//-> 오류 확인될 시 적절히 import 작성 
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt(); //출력 하면 숫자를 입력 가능 하고 그걸 다시 input 에 넣음	
		//스캐너를 통해 입력받은 정수를 input1 변수에 대입 
		
		//System.out.println(input1);
		
		System.out.println("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d =%d\n", input1, input2, input1 + input2);
		
		
		
		
	}

}

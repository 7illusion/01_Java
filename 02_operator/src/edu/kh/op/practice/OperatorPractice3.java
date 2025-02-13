package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	
	public void practice1() {
	  
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("가격을 입력 하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true/없으면 false 입력) : ");
		boolean input2 = sc.nextBoolean();// boolean true false 입력 받기
		
		Double result = input2 == true ? (Double) (input1*0.9) : (Double) (input1*0.95) ;
		
		System.out.printf("할인을 포함한 최종금액 : %.1f", result );

	}
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000;//5만원권 지폐 갯수
		//amount = amount % 50000; //잔액을 다시 amount 에 재대입 복합대입은 강제 형변환도 해줌 
		amount %= 50000; // 복합대입 연산자 (%와 = 을 합쳐 사용) <- 위에 줄보다 더 간단히 작성 += ,-= *=,/= 도 있음 
		
		int tenTh = amount/10000; // 1만짜리 지폐 갯수
		amount %= 10000;
		
		int fiveTh = amount/5000;//5천원권 지폐 갯수
		amount %= 50000;
		
		int oneTh = amount/1000;//1천원권 지폐 갯수
		amount %= 1000; 
		
		System.out.println("50000원 : "+ fiftyTh);
		System.out.println("10000원 : "+ tenTh);
		System.out.println("5000원 : "+ fiveTh);
		System.out.println("1000원 : "+ oneTh);
			
		
		/*if (ATM >= 50000) {
			int result1 = ATM / 50000 ;
		} else {
			if(ATM >= 20000) {
				int result2 = ATM / 20000;
			}
			else {
				
			}
		}*/
		
		
		//int result1 = ATM >= 50000 ? (int) (ATM/50000) :   ;
		

	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : " );
		int num1 = sc.nextInt(); 
		
		System.out.print("두 번째 수 : " );
		int num2 = sc.nextInt(); 
		
		String result = num1 % num2 == 0? "배수입니다." : "배수가 아닙니다." ;
		
		System.out.println(result);
		
		
	}
	
}

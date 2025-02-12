package edu.kh.op.practice;

import java.util.Scanner;

//기능 제공용

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		
		System.out.printf("1인당 사탕 개수 : %d \n 남는 사탕 개수 : %d ", input2/input1 , input2%input1 );
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input1 = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int input2 = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int input4 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별(남학생/여학생) : ");
		String input5 = sc.nextLine();
				
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double input6 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다. ", input2 , input3, input4, input1, input5 ,input6);
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input3 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input4 = sc.nextInt();
		
	    System.out.printf("합계 : %d\n", input2 + input3 + input4);
	    System.out.printf("평균 : %.1f", (input2 + input3 + input4)/3.0);
	    
				
	}
	
}

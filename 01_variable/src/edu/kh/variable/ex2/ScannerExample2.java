package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {

		//사칙연산 계산기 
		//-> 두 실수를 입력받아 사칙연산 결과를 모드 출력
		//-> 단, 출력된 결과값은 소수점 이하 2쨰 자리까지만 표현 
		//Scanner 필요 입력을 받아야 하기 때문 
		
		Scanner sc = new Scanner(System.in); 
		//ctrl + shift + o --> 현재 import 되지 않는 클래스 모드 import 해주는 단축키
		
		//정수면 nextInt 실수는 nextDouble
		
		System.out.println("첫번쨰 실수 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.println("두번쨰 실수 입력 : ");
		double input2 = sc.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f \n", input1 , input2 , input1 + input2);
		System.out.printf("%.2f - %.2f = %.2f \n", input1 , input2 , input1 - input2);
		System.out.printf("%.2f * %.2f = %.2f \n", input1 , input2 , input1 * input2);
		System.out.printf("%.2f / %.2f = %.2f \n", input1 , input2 , input1 / input2);
		
	}

}

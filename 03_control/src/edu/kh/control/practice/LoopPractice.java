package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		String result = "";
		
		for (int i = 1; i <= input; i++) {
			
			if (i>=0) {
				
				result += i + " ";
				
			} else {
               System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		System.out.printf("%s", result);
		
	}

	
	public void practice2(){
		

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		String result = "";
		
		for (int i = input ; i > 0; i--) {
			
			if (i>=0) {
				
				result += i + " ";
				
			} else {
               System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		System.out.printf("%s", result);
		
	}

	
	public void practice3(){
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		String result = "";
		
		for (int i = 1; i <= input; i++) {
			
			if (i < input) {
				result += i + " + ";
			} else {
				result += i + " ";
			}
			
			sum += i;
		}
		System.out.printf("%s = %d", result, sum);
		
	}
	
	
	public void practice4(){
		
		System.out.print("첫 번째 숫자 : ");
		int input1 =sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int input2 =sc.nextInt();
		
		String result = "" ;
		
		if (input1 < 1 || input2 < 1) {
			  System.out.println("1 이상의 숫자를 입력해주세요.");			
		} else if (input1 >= input2){
			for (int i = input2; i <= input1; i++) {
					result += i + " ";
			} 		
		} else {
				for (int i = input1; i <= input2; i++) {
					result += i + " ";
			}
		}
		System.out.println(result);
		
		}

	
	public void practice5(){
		
		System.out.print("숫자 : ");
	    int input = sc.nextInt();
	    
	    System.out.printf("===========%d단==========\n",input );
	    for (int i = 1; i <=9 ; i++) {
	    		
			System.out.printf("%d x %d = %d\n",input , i,input * i);
		}
		
	}
	
	
	public void practice6(){
		
		System.out.print("숫자 : ");
		int input =sc.nextInt();
		
	if (input <2 || input >9) {
		System.out.println("2~9 사이 숫자만 입력해주세요.");
	} else {
		for (int dan = input; dan <= 9; dan++) {
			 System.out.printf("====%d단====\n",dan);
		   for (int i = 1; i <= 9; i++) {
		   
			System.out.printf("%d x %d = %d\n",dan,i,i*dan);
		   }
			
		 }
	  }
		
	}

	
	public void practice7(){
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
				
		for (int i = 1; i <=input ; i++) {
		 	
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice8(){
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
				
		for (int i = 1; i <=input ; i++) {
		 	
			for (int j =input ; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice9(){
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <=input; i++) { // 높이
			
			for (int j = 1 ; j <= input - i; j++) { //공백
				System.out.print(" ");				
			}
			for (int j2 = 1; j2 <= i; j2++) { //* 출력 
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	public void practice10(){
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			
		}
		
		
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


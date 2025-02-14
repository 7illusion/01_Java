package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { //기능 제공용 클래스 
	
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		for(int i = 1;i<= 10; i++) { //
			System.out.println(i);
		}
		
	}
	
	public void ex2() {
		for (int i = 'A' ; i <= 'Z'  ; i ++) { // char 은 '' 으로 넣어주면 됨 
			System.out.print((char)i);
			
		}
		System.out.println("============================================");
		
		for (char ch = 'A' ; ch <= 'Z'  ; ch ++) { 
			System.out.print(ch);		
	}
	
	
	}
	
	public void ex3() {//1부터 입력받은수까지 1씩 증가하며 출력
		
		
		System.out.print("번호 입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
		System.out.println(i);	
		}
		
	}
	
	public void ex4() {//정수 5개를 입력받아서 합계 구하기 
		
		
		//[실행화면]
		//입력 1 : 10
		//입력 2 : 20
		//입력 3 : 30
		//입력 4 : 40
		//입력 5 : 50
		//합계 : 150
		
		int total = 0; // 합계 저장용 변수 
		
		for (int i = 1; i <= 5; i++) {
			
		//	System.out.print("입력" + i + " : ");
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();  // for 문에 있는 input 은 for문 에서만 사용 가능 
			
			//total 에 입력받은 input 값 누적 
			//total = total + input 이 형태를 기억 
			total += input;
		}
		
		System.out.println("합계 : " + total);
		
	}
	
	
	public void ex5() {//1부터 20까지 1씩 증가하면서 출력 
		
		// 단 ㅡ입력받은 수의 배수는 양쪽에 () 표시 
		//괄호를 표시할 배수 : 3
		//1 2 (3) 4 5 (6) 7 8 (9)......20 
		
		//괄호를 표시할 배수 : 4
	    //1 2 3 (4) 5 6 7 (8) 9......(20) 
		
		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			
			
			// 조건문 이니깐 조건식에 넣기
			if (i % input == 0) { //배수일 떄
				System.out.printf("(%d) ", i);
			}else { // 배수가 아닐 때
				System.out.print(i+" ");
			}	
			
		}
		
	}

	public void ex6() {//구구단 출력
		
		//2~9 사이 수를 하나 입력 받아 
		//해당 단을 출력 
		//단, 입력받은 수가 2~9사이 숫자가 아니라면
		//"잘못 입력하셨습니다." 출력 
		
		/*
		 * 단 입력 : 5
		 * 5 x 1 = 5
		 * .
		 * .
		 * .
		 * 5 x 9 = 45
		 * 
		 * ==========
		 * 
		 * 단 입력 : -5 
		 * 잘못 입력하셨습니다.
		 * 
		 * */
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		if (input>=2 && input<=9) {
			
			for (int i = 1; i <= 9; i++) {
				
			int result = input * i ;
			System.out.printf("%d x %d = %d\n", input , i ,result);
			
			}
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}

	public void ex7() {// 숫자 세기 count
		
		//1부터 20까지 1씩 증가하면서 
		//입력받은 수의 배수의 총 개수 출력 
		//입력받은 수의 배수의 합계 출력 
		
		//배수 입력 : 3
		//3 6 9 12 15 18 : 6개 
		//3의 배수 합계 : 63 
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		int count = 0; //n의 배수의 개수를 세기 위한 변수 
		int sum = 0 ; //합계
		
		String result ="" ; //비어 있는 문자열을에 숫자를 넣을 수 있기 때문에 
		
		for (int i = 1; i <= 20; i++) {
			
			if (i%input == 0) {
				
				result += i + " " ; //초기화된 문자열에 숫자를 대입하면서 정렬
				count++; //갯수 세기 찾을떄 마다 반복할떄 마다 1씩 증가
				sum += i ;//합계 누적 sum = sum + i 
						
			} 
			
		}
		System.out.printf("%s : %d개\n",result , count);
		System.out.printf("%d의 배수 합계 : %d" ,input,sum);
		
	}

	public void ex8() {//구구단 모두 출력 하기 
			
		for (int dan = 2; dan <=9; dan++) {
			
			for (int num = 1; num <=9; num++) {
				 System.out.printf(" %d x %d = %2d ", dan , num, dan * num ); //마지막에 두칸 확보하고 출력					
				
			}
			System.out.println();
			
		}
		
	}
	
	public void ex9() {//구구단 모두 역순으로 출력 하기 
		
		for (int dan = 9; dan >=2; dan--) {
			
			for (int num = 1; num <=9; num++) {
				 System.out.printf(" %d x %d = %2d ", dan , num, dan * num ); //마지막에 두칸 확보하고 출력					
				
			}
			System.out.println();
			
		}
		
	}













}



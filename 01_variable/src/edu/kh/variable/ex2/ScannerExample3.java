package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {

		// 문자열(String)을 3번 입력받아 한줄로 출력하기 
		//문자열이 3번 입력받으면 마지막에 또 다른 문자열이 나옴
		
		Scanner sc = new Scanner(System.in);  // ctrl + shift + o 
		
		//sc.next()     : 다음 입력된 한 단어를 읽어옴 
		                   //공백(스페이스,탭 등) 만나면 입력을 중단
		//sc.nextLine() : 다음 입력괸 한 줄을 읽어옴 
		//               공백과 함께 입력된 모든 내용을 입력받음 
//		String input1 = sc.next(); //-> 공백을 입력 받으면 중단 한 단어만 출력		
		
		
		System.out.print("입력1 : ");
		String input2 = sc.nextLine();
		System.out.print("입력2 : ");
		String input3 = sc.nextLine();
		System.out.print("입력3 : ");
		String input4 = sc.nextLine();
		
		System.out.printf("%s %s %s\n ",input2, input3, input4 );
		
	}

}

package edu.kh.array2.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Example {
/*
 * 2차원 배열
 * 
 * 자료형이 같은 1차원 배열을 묶음으로 다루는것 
 *
 * 참조변수 ==참조형 ==레퍼런스 변수 == 레퍼런스 
 * */
	
	Scanner sc = new Scanner(System.in);
	
	
	public void ex1() {
		//new 자료형[행크기][열크기]
		//heap 영역에 int 2차원 배열 2행 3열 공간을 할당 
		// 그 공간의 주소 arr 참조변수에 대입 
		
		//2차원 배열 초기화
		//직접도 가능 
		int[][] arr = new int[2][4];
		/*
		 * arr[0][0] = 10; 
		 * arr[0][1] = 20; 
		 * arr[0][2] = 30;
		 * 
		 * arr[1][0] = 40; 
		 * arr[1][1] = 50; 
		 * arr[1][2] = 60;
		 */
		
		//2중 for문을 이영한 초기화 
		int num = 10; //배열 요소 초기화에 사용할 변수 
		
		//* 배열 길이 
		System.out.println(arr.length); // 2 -> 1차원이 배열이 2개 있기에 행길이만을 가져옴 
		System.out.println(arr[0].length); //4 -> 2배열 안에 특정 1차원 배열의 행길이를 알려줌 
		
		for (int row = 0; row < arr.length; row++) { // 행 반복(0,1)
			for (int col = 0; col < arr[row].length; col++) {// 열 반복 (0,1,2,3)
				
				arr[row][col] = num ;
				num += 10 ;
			}
			
		}
		
		
		//3 선언과 동시에 초기화 
		int[][] arr3 = {{5,6,7,8}, {1,6,4,3}};
		
		
		//Arrays.toString(arr) 참조하고 있는 1차원 배열의 값을 문자열로 반환 
		System.out.println(Arrays.toString(arr)); // 1차원 배열의 주소값을 가지고 있기 때문에 
		
		//Arrays.deepToSting(배열명) : 참조하고 있는 배열의 실제 데이터가 나오는 
		//부분까지 파고 들어가서 모든 값을 문자열로 반환 
		System.out.println(Arrays.deepToString(arr));
		
		int[][] arr2 = {{1,2,3,4} , {5,2,3,4}};
		
	}

	
	public void ex2() { // 각 행의 합 구하기 
		//2차원 배열 선언과 초기화를 동시
		//3행 3열 짜리 정수형 2차원 배열 선언과 동시에
		//1~9 까지 초기화 
		int[][] arr = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		// 행별로 합출력 
		
		for (int row = 0; row < arr.length; row++) {// 행반복
			
			int sum = 0 ;
			
			for (int col = 0; col < arr[row].length; col++) {// 열반복
				
				sum += arr[row][col] ; //각 행의 값이 더해짐 		
			}
			System.out.printf("%d의 합 : %d\n", row , sum);
		}
		
		System.out.println("=================================");
		
		//열 별로 합 출력  12,15 ,18 
		
		for (int col = 0; col < arr.length; col++) {
			int sum = 0;
			for (int row = 0; row < arr[col].length; row++) {
				sum += arr[row][col] ;
			}
			System.out.printf("%d열의 합 : %d\n",col ,sum);
		}
		
		
		
	}


	public void ex3() { //가변 배열 
		//가변 배열 
		//2차원 배열 생성 시 마지막 배열 차수 (열)를 지정하고 않고
		// 나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열 
		
		char[][] arr = new char[4][];// 행 부분만 생성	
		
		arr[0] = new char[3] ; //0행에 3열짜리 1차원 배열을 생성하여 주소값 저장 
		arr[1] = new char[4] ; //1행에 4열짜리 1차원 배열을 생성하여 주소값 저장 
		arr[2] = new char[5] ; //2행에 5열짜리 1차원 배열을 생성하여 주소값 저장 
		arr[3] = new char[1] ; //3행에 1열짜리 1차원 배열을 생성하여 주소값 저장 
		
		char ch = 'a' ;  //초기화 값 
		
		for (int row = 0; row < arr.length; row++) { // 4
			
			for (int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = ch ++ ; // a 먼저 넣고 b  
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	
	}

}

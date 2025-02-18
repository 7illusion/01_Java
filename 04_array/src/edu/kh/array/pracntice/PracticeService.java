package edu.kh.array.pracntice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1 ;
			
			if(i % 2 == 0) {
				sum += arr[i]; 
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : "+ sum);		
	}

	
	public void practice2(){
			int[] arr = new int[9];
			int sum = 0;
			
			for (int i = 0 ; i < arr.length; i++) {
				arr[i] = 9 - i  ;
				
				if(i % 2 == 1) {
					sum += arr[i]; 
				}
				
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("홀수 번째 인덱스 합 : "+ sum);		
		
	}


	public void practice3(){
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		//int[] arr = new int[sc.nextInt()];  -> 한 줄로 표현이 가능 
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+ 1;
			System.out.print(arr[i] + " "); //데이터만 뽑아 씀 
		}
		
	//	System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void practice4(){
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			arr[i] = input ; 			
						
		}
		
		boolean flag = false ;
		
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input2) {
				System.out.println("인덱스 : " + i);
				flag = true;	
				break;
			}
	
		}
		if(!flag ) {
			System.out.println("존재하지 않음");
		}	
		
	}

	
	public void practice5(){
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] arr = new char[str.length()];
		
		
		//String.charAt(index) 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char chr = sc.next().charAt(0);
		
		int count = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == chr) {
				count++ ;		
			}
		}
		
		String index = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == chr) {

				index += i+ " ";
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n", str,chr,index);
		System.out.printf("%c 개수 : %d" ,chr ,count);
		
		
	}

	
	public void practice6(){
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			int arrinput = sc.nextInt();
			arr[i] = arrinput ;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i] ;
		}
		
		System.out.println("\n총합 : "+ sum);
						
	}

	
	public void practice7(){
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[]arr = new char[input.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
	    char[] copyArr = new char[input.length()];
				
		for (int i = 8; i < arr.length; i++) {
			copyArr[i] = '*'  ; //char 형은 '' 으로 넣을 수 있다 
		}
		
		System.arraycopy(arr, 0, copyArr, 0,8 );
		
		System.out.println(copyArr);
		
		
		
		
	}


	public void practice8(){
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for (int i = 0; i < arr.length; i++) {
			if (3> input || (input%2 ==0)) {
				System.out.println("다시 입력하세요");
			} else {
				for (int j = 0; j <= (arr.length)/2; j++) {
					arr[j] = j + 1;
				}
				for (int j = arr.length - 1; j > arr.length/2 ; j--) {
					arr[j] = input - j ;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	
	public void practice9(){
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);// 0.0<= <1
			arr[i] = random;
		}
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
	}


	public void practice10() {
		
		int[] arr = new int[10];
	
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random ;	
		}
		
		int max = arr[0] ;
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i] ;
			}
			if (arr[i] < min) {
				min = arr[i] ;
			}
		}
		System.out.println("발생한 난수 : "+ Arrays.toString(arr));
		System.out.println("최대값 : "+ max);
		System.out.println("최대값 : "+ min);
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random ;
			
			for (int j = 0; j < i; j++) {
				if (random == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		// for (데이터타입 변수명 : 배열 또는 컬렉션) {
		    // 반복할 코드
		//  }
		//✔ 배열 또는 컬렉션에서 하나씩 값을 가져와 변수명에 저장한 후 반복문 실행
		//✔ 반복 횟수는 배열(또는 컬렉션)의 길이만큼 자동으로 결정됨
		//✔ index를 직접 사용할 필요 없음 → 코드가 간결해짐


		
		for (int num : arr) { // , 없이 데이터만 출력 
			System.out.print(num + " ");  
		}
	}
	
	
	public void practice12(){
		
		
	}
	
	
	public void practice13(){
		//1.사용자에게 문자열 입력받기
		
		//2.해당 문자열의 문자들을 char[]에 담기 
		
		//3.char 배열에서 중복값 존재할 경우 출력 x 
		
		
	}
	
	public void practice14(){
		//1. 첫 배열 크기 지정 
		
		//2. 첫 배열에 저장할 문자열 입력받기 
		
		//3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어사 break;
		// 횟수가 현재 정해지지 않음 ->while 
		
		//4. 값을 더 입력할 경우 
		
		//5. 더 입력받을 개수 입력받기 
		
		//6. 새로 값을 입력받을 배열 생성 -> 기존 배열 크기 + 추가 입력 개수 
		
		//7. 배열 복사 + 새로운 문자열 입력받기 
		
		
		//8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
		//만약 더 입력 y 할 시 코드를 반복할때 기존 배열인 arr의 길이를 기준으로
		//새 배열(newArr) 
		
	}
	
	
	
	
}

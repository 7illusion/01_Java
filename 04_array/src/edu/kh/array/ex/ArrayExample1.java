package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	/*
	 * 배열
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는것 .
	 * 묶어진 변수들은 하나의 배열명을 불러지고 
	 * 구분은 index를 이용함 (index는 0부터 시작하는 정수 )
	 * 
	 * 
	 * */

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		//변수 와 배열의 차이 
		
		//====변수 선언 
		int num ; 
		//sTack 영역에 int 자료형을 저장할 수 있는 공간 4바이트 할당
		//그 공간에 num 이란 이름을 부여
		
		//====변수 대입  
          num =10;
		
		//====변수 사용  num 이 작성된 자리에 num에 저장된 값을 읽어와서 출력 
		System.out.println("num값 호출 "+ num);
		//------------------
		
		//====배열 선언 stack 영역에 int[] 자료형 공간을 4바이트 할당하고 그 공간에 arr 이라는 이름을 부여 
		//해당 변수는 참조형으로 주소값만을 저장할 수 있다 !!
		int[] arr ; 

		//====배열 대입 
		//new 연산자라고 하며 Heap 메오리 영역에 새로운 공간(배열,객체)을 할당 
		//int[3] -> int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		//new int[3]: heap 영역에 int 형 변수 3칸짜리 int[] 을 생성 (할당)
		//같은 자료형은 연산가능 
		arr = new int[3];
	    System.out.println(arr); // 주소값을 출력 
	    System.out.println(arr[1]); // 인데스 번호를 입력하여 그 공간에 무엇이 있는지 출력  
 		//heap영역에 할당된 공간은 !절대! 비어있을 수 없다
	    //boolean 은 false 나머지는 다 0 , 참조형은 null 로 최초 저장되어 있다 . 
	    
		//====배열 요소 값 대입 
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 60;
		
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 //[10,50,60] 실제 arr 배열이 가진 모든 요소의 값을 알고 싶을때
		 
		 //Arrays.toString(배열명);-> 배열에 있는걸 반환한다 
		 System.out.println( Arrays.toString(arr));
		
		
	}

	
	public void ex2() {
		
		int[] arr = new int[4];
		
		//arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		int[] arr2 = {100,200,400,1000};
	//	arr[4] = 100 ; -> 런타임 에러 발생 
		//코드에서 빨간줄 에러 : 컴파일 에러 
		//실행했을 떄 발생하는 에러 : 런타임 에러 
		
		//배열과 for문 
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println(arr2[1]);
		
		for (int i = 0; i < arr2.length; i++) {
			// i -> 0 1 2 3
			System.out.printf("arr2[%d]d에 저장된 값 : %d\n", i,arr2[i]);
		}
		
		// 선언과 동시에 초기화 방법 int[] , String[] 주소값을 arr3 ,fruit 참조변수가 참조함 
		int[] arr3 = {100,300,600,1000};
		String fruit[] = {"사과","포도","참외"}; 
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(fruit));
		
	}

	
	public void ex3() {
		//5명의 키(cm)를 입력받고 평균 구하기 
		//1번 키 입력 :
		//2번 키 입력 :
		// ..
		//5번 키 입력 :
		//평균 :
		
		double[] height = new double[5]; 
		//double 배열 자료형 참조변수 height를 stack 영역에 생성하고
		//height 에 heap 영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입 
		
		for (int i = 0; i < height.length; i++) {			
						
			System.out.print((i+1) + "번 키 입력 : ");//1,2,3,4,5
			height[i] = sc.nextDouble();
			
		}
		System.out.println();
		double sum = 0; //합계 저장용 변수 
		
		for (int i = 0; i < height.length; i++) {
			sum += height[i];
			
		}
		
		System.out.printf("평균 : %.2f cm", sum/height.length);
		
	}

	
	public void ex4() { // 중요 예제
		//입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계,평균 ,최고점 ,최저점 출력 
		
		//ex
		//입력 받을 인원 수 :4
		//1번 점수 입력 : 100
		//2번 점수 입력 : 80
		//3번 점수 입력 : 50
		//4번 점수 입력 : 60
		
		//합계 : 290 
		//평균: 72.5
		//최고점 : 
		//최저점 :
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		
		int[] score = new int[input]; // input 만큼 배열에 할당 	
		
			
		for (int i = 0; i < score.length ; i++) {
			
			System.out.print((i+1)+"번 점수 입력 : ");
			score[i] = sc.nextInt(); //위에서 받은 점수를 배열에 대입 
			
			sum += score[i];	
					
		}
		//== 합계를 구함 -> 평균도 쉽게 구할수 있음 
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 0; i < score.length; i++) {
			//최고점 비교
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
				
			}
			
		}
		System.out.printf("합계: %d\n평균: %.1f\n최고점: %d\n최저점: %d",sum,(double)sum/score.length,max,min);
		
	
		
		
		
		
	}


	public void ex5() {//메뉴 뽑기 프로그램
		String arr [] = {"김밥","서브웨이","햄버거","백반","국밥","짜장면"};
		
		System.out.println("오늘 점심 메뉴 : "+ arr[(int)(Math.random() * 6)]); //1.0미만이기에 6이 들어와야함 
		//0<= ㅇ < 1 
		
	}

	
	public void ex6() {
		//배열을 이용한 검색 
		//입력받은 정수가 배열에 있는지 없는지 확인 
		//만약 있다면 몇번 인덱스에 존재하는지 출력 
		
		//정수 입력 : 200
		//1번쨰 인덱스에 존재
		
		//정수 입력 : 5 
		//존재하지 않음 
		
		int arr[] = {100,200,300,400,500,600,700,800,900,10000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//신호를 나타내기 위한 변수 ,찾는 문제에서 많이 사용
		boolean flag = false ; //검사전에는 없다고 가정 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.println(i + "번쨰 인덱스에 존재");
				flag = true; //일치하는 값이 있으므로 true 변경 
			}
			
		}
		
		//flag 상태를 검사 
		//flag가 false 라면 일치하는 값을 차지 못했다라는 의미 
		//그런데 flag가 flase 라면 if 조건식이 false 이므로 수행되지 않음 
		//-> ! (Not 연산자 : 부정 논리 연산자) 붙여줌으로써 true 로 변경하여 
		//{} 안에있는 코드를 수행하게끔함 
		
		if(!flag) { //입력한 값이 배열에서 찾지 못했을떄 
			System.out.println("존재하지 않음");
		}
		
	}

	
	public void ex7() {
		//입력받은 값과 일치하는 값이 있으면 인덱스번호 출력
		//없으면 "존재하지 않음" 출력
		
		String arr[] = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		/*
		 * 과일 입력 : 아보카도
		 * 5번쨰 인덱스에 존재
		 * 
		 * 과일입력 : 수박 
		 * 존재하지 않음 
		 * */
		
		System.out.print("과일 입력: ");
		String str = sc.next();
		
		boolean flag =false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(str)) { // string 비교는 .equlas 참조형 비교는
				System.out.println(i + "번쨰 인덱스에 존재");
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
		
	}

	
	public void ex8() {
		//string 은 참조형 ///두개는 저장되는 메모리 형태가 다름 
		String str ="가나다"; //String Constant pool 저장 상수 풀 --> 만약 String str4 = "가나다" 이면 똑같은 주소를 이용
		String str2 = new String("가나다"); // heap 영역에 저장 -->만약 String str3 = new String("가나다"); 이 있다면 내용이 같아도 다른 주소를 가지고 있음 --> 완전히 다른 값
		
		//string 클래스의 toString() 메소드가 존재
		//toString() 메소드는 자기 자신을 그대로 반환 
		//프린트 str 을 실행하면 자동적 toString 으로 자동으로 호출
		//주소를 보는 방법은 
		System.out.println(System.identityHashCode(str) ); // 이런 형태로 주소를 볼 수 있다 홓
		
		String strArr [] = {"딸기", "바나나", "키위"};
		
	}


	public void ex9() {
		//문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		//2.문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인 
		//3.단 , 일치하는 문자 없을 경우 "존재하지 않습니다." 출력 
		
		/*
		 * 문자열 입력 : hello 
		 * [h,e,l,l,o]
		 * 검색할 문자 입력 : l
		 * 2개 있음 or 없다면 존재하지 않습니다.
		 * 
		 * 배열 검색 , 문자열의 길이를 알아야함 String.length() 메소드를 활용 "hello".length() -> 5
		 * String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴 
		 * ex)"hello".charAt(1) -> e 
		 * 
		 * count 로 숫자세기
		 * 
		 * */
		
		System.out.print("문자열 입력");
		String input = sc.nextLine(); // 공백까지 포함 시킬 수 있음 
		
		char[] arr = new char[input.length()]; //문자열의 길이에 따라 배열 만듬 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i); // 문자 하나하나를 배열에 대입 
		}
		System.out.println(Arrays.toString(arr));
		
		//2.문자하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		
		System.out.print("검색할 문자 입력 : ");
		char chr = sc.next().charAt(0);  // 0번째 인덱스 
		//String.charAt(0) -> String 의 0번쨰 인덱스 하나를 추출해서 char 형태로 반환 
		//"h" -> 의 0번쨰 인덱스 는 char형태의 'h' 
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == chr) {
				count ++ ; // 같은 문자를 찾으면 카운트가 올라감 
			}
		}
		
		if (count > 0) {
			System.out.printf("%d개 있음",count);
		} else {
			System.out.println("존재하지 않음");

		}
	
		
		
		
		
	}
}

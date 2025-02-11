package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {

		/*
		 * 강제 형변환 
		 * -기존 자료형을 원하는 자료형으로 강제 변환 시키는 것 
		 * 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 떄 
		 * 2)출력되는 데이터의 표기법을 변환시키고 싶을 떄 
		 * 
		 * 강제 형변환 방법 
		 * -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성 
		 * */
		
		double temp = 3.14 ;
		int num = (int)temp;
		
		//실수형 double -> 정수형 int 변환시 소수점 아래자리 손실 
		System.out.println("temp : " + temp); //3.14
		System.out.println("num : " + num); //3 
		
		int iNum = 290;
		byte bNum = (byte)iNum;
		//같은 정수형 끼리의 변환시에도 
		//값의 범위차이 떄문에 데이터 손실이 발생한다
		System.out.println("iNum : " + iNum); 
		System.out.println("bNum : " + bNum); 
		
		//char -> int 강제 형변환 
		char ch = 'A';
		System.out.println((int)ch);//65 
		
		//int -> char 강제형변환 
		//44085
		int i5 = 44085 ;
		System.out.println((char)i5); //갵
		
		//오버플로우 현상은 컴퓨터가 예측 불가 ,개발자 자신이 미리 예측해야함 
		
		int i6 = 2147483647; // int 최대값 
		int result2 = i6 + 1;
		
		System.out.println(i6 + "  " + result2); // 오버플러우 발생하여 최소값이 나옴 
				
		
	}

}

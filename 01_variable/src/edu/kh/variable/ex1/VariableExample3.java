package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		//형변환 (casting) 
		/*
		 * 자동형변환: 자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
		 * 형변환이 필요한 이유
		 * 컴퓨터가 기본적으로 같은 자료형끼리만 연산이 가능함 다르면 오류
		 * --> 이런 상황을 해결하기 위해서 필요한 기술 
		 * 
		 * */

		int num1 = 10;
		double num2 = 3.5;
        System.out.println("자동 형변환 결과 : " + (num1 + num2)); //자동 형변환 덕분에 잘 계산이됌
        
        int i2 = 2_100_000_000; // _로 숫자의 , 역할이 가능하다 
        long l2 = 10_000_000_000l; //100억 
        
        long result = i2 + l2; // long 형 result long = long +
        System.out.println(result); 
        
        //char -> int 형변환 
        //char 자료형은 문자형이지만 실제 저장하는 값은 
        //0부터 6만 5천번 사이에 있는 숫자 (정수형)
        
        char ch3 = 'V';
        int i3 = ch3 ;
        System.out.println(i3);//86
        
        char ch4 ='각';
        int i4 = ch4 ;
        System.out.println(i4); //44033
	}

}

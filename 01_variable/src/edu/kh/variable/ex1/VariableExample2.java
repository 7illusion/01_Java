package edu.kh.variable.ex1;

public class VariableExample2 {

	/*
	 * 자바 기본 자료형 8가지
	 * 논리형 : boolean(1btye)
	 * 정수형 : byte(1byte) , short(2byte) , int(4byte) ,long(8byte) 
	 * 실수형 : float(4byte)  , double(8byte)
	 * 문자형 : char(2byte, 유니코드)  
	 * 참조형 : String 문자열
	 * */
	//변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것 
	//변수 값 대입 : 변수에 값을 집어 넣는 것 
	
	public static void main(String[] args) {

		boolean booleanDate ; //변수의 선언
		//메모리에 논리값(t/f)을 저장할 공간을 1byte 할당하고
		//할당된 공간의 이름을 booleanDate 라고 정하겠다.
		
		booleanDate = true ; //변수에 true 라는 논리값 대입 
		
		System.out.println("booleanDate : " + booleanDate);
		
		byte byteNum = 127;
		// 메모리에 정수값을 저장할 공간을 1btye 할당하고 byte 의 값의 범위는 -128~127까지 
		//할당된 공간을 byteNum 라고하고 선언된 변수에 초기값 넣음 --> 초기화 : 처음 변수에 값을 대입
		
		short shortNum = 32767;
		
		//정수 자료형 기본형 ! int (요즘은 byte 나 short 을 안쓴다 기본적으로 int 부터 시작)
		int intNum = 2147483647 ;
		//프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현
		
		/*리터럴 : 변수에 대입되거나 작성괴어지는 값 자체 . 
          자료형에 따라 리터럴 표기법이 다름 */
		
		long longNum = 10000000000l; // 뒤에 l 또는 L 을 붙여 long 타입 이라는 것을 표기 이것이 리터럴 표기법
		
		float floatNum = 1.2345f; // 실수형의 대표는 double 이기 때문에 뒤에 F or f 로 표기해줘야함  
		
		
		//문자형(char) 리터럴 표기법 : ' ' (홑따옴표) -> 문자 하나 표기
		char ch = 'a';
		char ch2 = 66; 
		/*
		 * char 자료형에 숫자가 대입될 수 있는 이유 
		 * 컴퓨터에는 문자표가 문자 모양이 각각 매핑되고 
		 * 'B' 문자 드개로 대입되면 변수에 숫자 66으로 변환되어 저장
		 * -> 반대로 생각하면 변수에 애초에 숫자 66 저장 가능
		 * */
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		//상수란 변하지 않는 값을 의미, 또한 선언 할떄는 모든글자를 대문자로하자 
		// 여러 단어가 작성시 _ 사용 
		//자바에서는 한 번만 저장할 수 있는 메모리 의미 ,초기화 이후 다른 데이터 값 대입 불가
		final int AGE = 1122;
		//AGE = AGE + 1 ; 이런식의 다른값을 넣을 수 가 없다 
		/*
		 * 상수를 사용하는 이유
		 * 변하면 안되는 고정된 값을 저장할 떄
		 * 특정한 값에 의미를 부여하는 경우
		 * */
		
         System.out.println(1 + 1.3); // 자바에서는 int 가 double 로 자동 형변환이 된다
         System.out.println('A' + 12); // 77로 출력 형변환이됌
         //강제 형변환은 데이터 손실이 발생 할 수 있어 데이터의 변형, 손실을 감수 하고 강제 변환
         
	}

}

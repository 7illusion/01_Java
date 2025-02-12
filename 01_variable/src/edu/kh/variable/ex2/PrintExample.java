package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
    //print문과 동일하게 출력은 해주지만 출력 후 자동으로 출력창에 줄바꿈을 해주는 메소드 println
	System.out.println("테스트1");
	System.out.println("테스트2"); 
	
	System.out.println();
	
	//() 안의 변수, 문자, 숫자, 논리 값을 모니터에 출력해주는 메소드 print 단순 출력
	System.out.print("테스트3");
	System.out.println();   // 이것만 있으면 줄바꿈을 한줄 해줄 수 있다
	System.out.print("테스트4");
	
	System.out.println();
	
	int iNum = 10;
	int iNum2 = 5;
	int iNum3 = 2;
	System.out.println(iNum + "+" + iNum2 + "=" + (iNum + iNum2)); //기본적으로 길고 복잡함 
	
	// printf 메소드로 정해져 있는 형식에 맞춰서 그 형식에 맞는 값(변수)을 줄바꿈 하지 않고 출력
	System.out.printf("%d + %d = %d\n",iNum ,iNum2, iNum +iNum2); //\n 은 줄바꿈이다 (escape 문자)
	// 순서에 맞게 변수를 대입하면 잘 출력됨
    // 	System.out.printf("패턴" , 패턴자리에 각각들어갈 변수/값 나열);
	
	//10 + 10 * 5/2 =35
	System.out.printf("%d + %d * %d / %d = %d\n",iNum ,iNum, iNum2 , iNum3, iNum + iNum * iNum2/iNum3);
	//기본적인 사칙연산은 할 줄암 
	
	//패턴연습 
	int iNum4 = 3;
	System.out.printf("%d\n", iNum4);
	System.out.printf("%5d\n", iNum4); // 5칸을 확보하고 오른쪽 정렬
	System.out.printf("%-5d\n", iNum4); // 5칸을 확보하고 왼쪽 정렬
	//숫자만 조절하여 몇칸을 확보 할지 정할 수 있음 
	
	//소수점 자리 제어 (반올림 처리)
	System.out.printf("%f\n", 10 / 4.0); //소수점 아래 6자리
	System.out.printf("%.2f\n", 10 / 4.0); //소수점 아래 2자리
	System.out.printf("%.4f\n", 10 / 4.0); //소수점 아래 4자리
	
	//문자,문자열, boolean
	boolean isTure = false ; 
	char ch = '가' ;
	String str = "안녕하세요" ;
	
	// false / 가 / 안녕하세요
	System.out.printf("%b / %c / %s\n ",isTure, ch, str);
	
	System.out.println("\\");
	System.out.println("a\tb\tc\td");//a	b	c	d 한번에 공간차지 
	
	//유티코드 이스케이프 
	System.out.println("\u0041"); //유니코드(16진수)
   //65 / 16 = 4 나머지는 1 
	
	
	/*
	 *  %d : 정수형, %o : 8진수, %x : 16진수
        %c : 문자, %s : 문자열
        %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
        %A : 16진수 실수
        %b : 논리형
	 * */
	}

}

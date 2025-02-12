package edu.kh.basic;

//코드 변경 테스트
//코드 변경 테스트 2
//한 줄 주석: 컴파일러가 해석하지 않는 부분
/* 범위 주석 */

// class : 자바 코드가 작성되는 영역
/* 
 Crtl + 스페이스  -> 빠른 명령어 찾기
 ctrl + s -> 빠른 저장
 ctrl + f11 -> 실행 단축키
*/
//syso ;

public class JavaTest {
	
	public static void main(String[] args) {
	System.out.println("Hello world!");	// 이런 기능을 가지고 있는것이 메소드 
	System.out.println("뭐먹"); 
	System.out.println("12345");
	// ctrl + alt + 방향키 (위아래) : 방향키 방향으로 해당 줄 복사
	System.out.println("왜 두번 써지지");
	System.out.println("왜 두번 써지지");
	
	System.out.println("1 + 2 = " + "3");
	System.out.println(1+2); // 숫자 연산은 그냥 된다
	//""안에 작성되지 않은 코드는 숫자, 변수로 인식된다. 안데 작성된 코드는 단순 문자열로 인식한다.
	
	System.out.println(50-13);
	System.out.println(10*23);
	System.out.println(50/5);
	System.out.println(12%2); // 나누기 후에 나오는 나머지를 출력 
	System.out.println("14 * 19 = " + 266); // ""문자열 + 숫자 함께 가능  
    System.out.println("14 * 19 = " + 14*19); 
    
	System.out.println("90 + 70 + 65 = " + 90 + 70 + 65); // 이런 방식은 그냥 숫자를 나열함  
	System.out.println("90 + 70 + 65 = " + (90 + 70 + 65)); // 괄호를 해야 연산이됌   
	
	System.out.println("A" + "B");
		
	}
	
}

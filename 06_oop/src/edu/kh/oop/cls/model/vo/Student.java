package edu.kh.oop.cls.model.vo;

public class Student { //z클래스 선언부 
//[접근제한자] [예약어] class 클래스명 
	
	//접근제한자 public : 같은 프로젝트 내에서 
	//어떤 클래스에서든 import 하여 사용할 수 있음을 나타냄 
	
	//1.필드 : 객체(클래스)의 속성을 작성하는 클래스 내부영역 
	//==멤버변수로 같고 2가지로 나누어진다 
	
	//-1) 인스턴스 변수 : 필드에 작성되는 일반 변수 
	//EX) private int age ;
	
	//-2)클래스 변수(==static 변수) : 필드에 static 예약어가 작성된 변수 
	//EX) public static String schoolName;
	
	//필드 접근제한자 예제
	//필드의 접근제한자 뜻 : 직접 접근 가능한 범위를 나타냄 
	public int v1 = 10 ; //전체 접근 가능
	protected int v2 =20;//후손클래스내까지 가능
	int v3 = 30;          //같은패키지 내에서만 default 
	private int v4 = 40 ; //해당클래스 내부에서만 
	
	//static 예약어
	public static String schoolName = "kh 고등학교";
	
	//final 예약어
	private final int TEMP1 = 100 ; //final 은 상수를 넣는다 변수명도 모두 대문자로 하는것이 기본
	
	//2.생성자
	
	
	
	
	//3.메서드 
	public void ex() {
	TestVO test = new TestVO(); // 같은 패키지라 default 로 설정된 클래스도 사용가능
	
	//필드 접근제한자 확인하기 v1 ~v4 까지는 같은 클래스 내부인 이곳에서는 직접 접근 가능
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
	System.out.println(v4);
	
	}

	public int getTEMP1() { //상수는 재대입이 불가능하기에 getter 만 만들어진다 
		return TEMP1;
	}

}

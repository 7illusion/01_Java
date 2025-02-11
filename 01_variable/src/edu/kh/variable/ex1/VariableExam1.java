package edu.kh.variable.ex1;

public class VariableExam1 { //왼쪽 클래스를 클릭하고 f2 로 클래스 이름 변경 가능 
                             //자바파일과 클래스 명은 같아야한다 
	
	public static void main(String[] args) {
		//변수를 선언 안하고 같은 값을 계속해서 쓸 때 
		System.out.println(2 * 3.14159265358973 * 5); // 원의 둘레 
		System.out.println(3.14159265358973 * 5 * 5); // 원의 넓이 
		System.out.println(3.14159265358973 * 5 * 5 * 20); // 원기둥 부피 
		System.out.println(4 * 3.14159265358973 * 5 * 5); // 구의 겉넓이 
		
		//변수를 선언하고 사용 했을떄 
		
		double pi = 3.14159265358973 ; // 원주율 값을 변수로 선언 ,오른쪽에서 왼쪽으로 대입 
		int r = 5; // 반지름
		int h = 20; // 높이 
		
		System.out.println(2 * pi * r); // 원의 둘레 
		System.out.println(pi * r * r); // 원의 넓이 
		System.out.println(pi * r * r * h); // 원기둥 부피 
		System.out.println(4 * pi * r * r); // 구의 겉넓이 
		
		/* 변수 variable 
		 * - 메모리(RAM)에 값을 기록하는 공간
		 * -> 공간에 가록되는 값(Date)이 변할 수 있어서 변수라고 한다.
		 * 
		 * - 변수는 여러 종류 존재 (저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점 
		 * 1.가독성 증가 
		 * 2.재사용성 증가 (한번 만든 변수를 계속 사용)
		 * 3.코드 길이 감소
		 * 4.유지보수 용이 해짐 
		 * 
		 * */
		
	}
	

}

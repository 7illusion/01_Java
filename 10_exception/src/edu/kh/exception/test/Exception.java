package edu.kh.exception.test;

public class Exception {
	
	public static void name() {
		
	//컴파일 에러
	int a = (int)99.99; // 앞에 int로 강제형변환을 해줘 코드 수정으로 컴파일 오류 해결 
	
	//런타임 에러
	int[] arr = new int[3];

	arr[0] = 10 ;
	arr[1] = 14 ;
	//arr[3] = 120 ; // 컴파일 오류가 나지는 않지만 런타임 하면 OfBoundException 발생하면서 오류가 생김 
	
	if(3>=arr.length) { // 이러건 if 문으로 예외 처리를 해줄 수 있다 인데스 범위 초과한 값이 들어 왔다면
		System.out.println("범위 초과");
	}else {
		arr[3] =30 ;
	}
	

	}
}
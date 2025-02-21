package edu.kh.oop.method.run;

import edu.kh.oop.method.modle.service.MemberService;
import edu.kh.oop.method.modle.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		
		MethodExample methodex = new MethodExample();
		
//		methodex.method1();
		
		MemberService service = new MemberService();
		service.displayMenu();
		
		
		//method2() 메서드 호출  마지막으로 들어왔지만 호출한 곳으로 되돌아가면 나감 LIFO
		//method1() 메서드 실행 <- 쌓이고 있음 
		//main 메서드를 실행을 시키면 
		

		
		
	}

}

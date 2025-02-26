package edu.kh.poly.ex1.run;

import edu.kh.poly.ex1.model.service.PolyService;

public class PolyRun {

	public static void main(String[] args) {
		
		PolyService poly = new PolyService();  
		poly.ex2();
		poly.ex4();

		
		
		//new PolyService().ex4(); 이런식의 실행 가능 
	}

}

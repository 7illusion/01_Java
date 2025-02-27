package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;

public class ExceptionRun {

	public static void main(String[] args) {

		try {
			new ExceptionService().ex5();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	
		
		
		
	}

}

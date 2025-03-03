package edu.kh.inheritance.run;

import java.security.PublicKey;

import edu.kh.inheritance.model.dto.BasicPhone;
import edu.kh.inheritance.model.dto.Phone;
import edu.kh.inheritance.model.dto.SmartPhone;
import edu.kh.inheritance.model.service.InheritanceService;

public class Run {

	public static void main(String[] args) {
		
		InheritanceService ih = new InheritanceService();
//		ih.ex1();
//		ih.ex2();
//		ih.ex4();
		
//		Phone ph = new Phone();
		
		SmartPhone sph = new SmartPhone("Samsung", "Galaxy S20", 2020,1200000, "Android", 128);
		System.out.print(sph.toString());
		System.out.print("===================================");
		BasicPhone bph = new BasicPhone("Nokia","3310",2000,100000 ,true);
		System.out.println(bph.toString());
		bph.checkKeyboard();
		
		
	
		

	}

}

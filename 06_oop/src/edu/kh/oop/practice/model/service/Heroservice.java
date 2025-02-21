package edu.kh.oop.practice.model.service;

import java.rmi.server.UnicastRemoteObject;

import edu.kh.oop.practice.model.vo.Hero;

public class Heroservice {
	
	public void practie() {
		
		
		Hero warrior = new Hero("이구역짱","전사",200,20,1,0);
		
		Hero wizard = new Hero("Zi존위자드","마법사",100,100,1,0);
		
		System.out.println(warrior.toString());
		System.out.println(wizard.toString());
		
		System.out.printf("======%s의 시정======" , warrior.getNickname());
		
		
		
		
		
	}

}

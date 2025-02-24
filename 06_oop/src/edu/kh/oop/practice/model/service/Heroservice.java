package edu.kh.oop.practice.model.service;

import java.rmi.server.UnicastRemoteObject;

import edu.kh.oop.practice.model.vo.Hero;

public class Heroservice {
	
	public void practie() {
		
		
		Hero warrior = new Hero("이구역짱","전사",200,20,1,0);
		
		Hero wizard = new Hero("Zi존위자드","마법사",100,100,1,0);
		
	
		
		System.out.printf("\n======%s의 시점======" , warrior.getNickname());
		warrior.attack(100);
		warrior.attack(50.5);
		warrior.attack(49.5);
		warrior.dash();
		warrior.dash();
		System.out.printf(warrior.toString(),
				           warrior.getNickname(),
				           warrior.getLevel(),
				           warrior.getHp(),
				           warrior.getMp(),
				           warrior.getExp());
		
		

		System.out.printf("\n======%s의 시점======" , wizard.getNickname());
		wizard.attack(300);
		wizard.dash();
		wizard.attack(300);
		wizard.attack(300);
		wizard.dash();
		System.out.printf(wizard.toString(),
				wizard.getNickname(),
				wizard.getLevel(),
				wizard.getHp(),
				wizard.getMp(),
				wizard.getExp());
		
		
		
		
		
	}

}

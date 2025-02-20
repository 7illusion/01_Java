package edu.kh.oop.practice.model.service;

import java.rmi.server.UnicastRemoteObject;

import edu.kh.oop.practice.model.vo.Hero;

public class Heroservice {
	
	public void practie() {
		
		
		Hero hero1 = new Hero();
		
		hero1.setNickname("이구역짱");
		hero1.setJob("전사");
		hero1.setHp(200);
		hero1.setMp(20);
		hero1.setLevel(1);
		hero1.setExp(0);
		
		Hero hero2 = new Hero("Zi존위자드","마법사",100,100,1,0);
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		
		System.out.println("======이구역짱 시정======");
		// if 문? 대시는 if문 쓰는것이 맞는거 같은데  처음부터 if 했을 떄 넘어가는 기준을 모르겠다
		System.out.printf("'%s'은/는 공격을했다!! 현재 경험치 : %d" ,hero1.getNickname(),hero1.getExp() + 100);
		
		
	}

}

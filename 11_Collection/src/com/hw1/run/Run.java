package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
	Friend friend = new Friend();
		
	List<Friend>friendList = new ArrayList<Friend>();

	friendList.add(new Friend("짱구"));
	friendList.add(new Friend("철수"));
	friendList.add(new Friend("유리"));
	friendList.add(new Friend("훈이"));
	friendList.add(new Friend("맹구"));
	
	int input = (int)Math.random() * 1 + 4;  // 0<= input < 1.0
	

	friendList.get(input).pickLeader();
	
	
	}

	
}

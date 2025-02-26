package com.hw2.model.service;

import java.util.Arrays;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {
	
	private Prisoner[] prisoners ; //전체 수용자 저장용 배열 
	private int prisonerCount;
	
	public Prison(int size) {

	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllPerson() {
		for (int i = 0; i < prisoners.length; i++) {
			System.out.print(prisoners[i]);
		}
		
	}

	
	
}

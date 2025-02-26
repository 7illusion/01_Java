package com.hw1.model.dto;

public class Textbook extends Book {
	
	private String subject ;
	
	public Textbook() {}
	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
@Override
public String toString() {
	return "[전문 서적]" + super.toString() + " / 과목 : " + subject ;
}

	@Override
	public void displayInfo() {
		System.out.print("[전문 서적]");

		
	}
	
	

	
}

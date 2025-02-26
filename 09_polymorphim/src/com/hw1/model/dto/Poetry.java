package com.hw1.model.dto;

public class Poetry extends Book {
	
	private int numberIfPoems ;
	

	public Poetry() {}
	
	public Poetry(String title, String author, int numberIfPoems) {
		super(title, author);
		this.numberIfPoems = numberIfPoems;
	}
	
	public int getNumberIfPoems() {
		return numberIfPoems;
	}

	public void setNumberIfPoems(int numberIfPoems) {
		this.numberIfPoems = numberIfPoems;
	}
	

@Override
public String toString() {
	return "[시집]" + super.toString() + " / 시 수 : " +numberIfPoems;
}

	@Override
	public void displayInfo() {
		System.out.print("[시집]" + toString());
		
	}

}

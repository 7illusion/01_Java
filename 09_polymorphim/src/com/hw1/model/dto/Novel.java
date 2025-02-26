package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre ;
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void displayInfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s", getTitle(),getAuthor(),genre); // super.getTitle 라고 쓰는 이유는 부모클래스(Book)클래스의 메서드를 명확히 호출하고 싶을 때 
		                                                                                            // 아니면 자식클래스에서 같은 이름의 메서드를 오버라이딩(재정의)을 한 경우 
		
	}
	
	

}

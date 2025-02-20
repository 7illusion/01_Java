package edu.kh.oop.practice.model.vo;

public class Book {

	private String title ;
	private int price ;
	private double discountRate ;
	private String author ;
	
	
	public Book() {} //오버로딩은 Book 이라는 메서드가 2개가 있다 원래라면 중복은 불가 하지만 
		           // 매개변수의 개수, 타입 순서가 한개라도 다르게 해주면 오버로딩이 되는것이다 
	
	
	
	public Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		// atl + shift + s  .....using field 선택하여 자동으로 매개변수를 정하고 만들어줌 
	}

	
	
	@Override // 오버라이드 alt + shift + s ....toString  toString 출력방법을 설정해 줄 수 있다 
	public String toString() {
		return  title + "/"  + price + "/" +  discountRate + "/" + author
				;
	}
	
	
//getter / setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

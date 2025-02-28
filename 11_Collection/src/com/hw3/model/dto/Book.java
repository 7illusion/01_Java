package com.hw3.model.dto;

public class Book {
	
	private int bookNumber ;
	private String bookSus ;
	private String author ;
	private int price ;
	private String pub ;
	
	public Book() {}

	public Book(int bookNumber, String bookSus, String author, int price, String pub) {
		super();
		this.bookNumber = bookNumber;
		this.bookSus = bookSus;
		this.author = author;
		this.price = price;
		this.pub = pub;
	}
	

	@Override
	public String toString() {
		return  bookNumber + "번 도서 : " + "[도서제목 : " + bookSus + " / 도서저자" + author + " / 도서가격" + price
				+ " / 출판사=" + pub + "]";
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookSus() {
		return bookSus;
	}

	public void setBookSus(String bookSus) {
		this.bookSus = bookSus;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
	

}

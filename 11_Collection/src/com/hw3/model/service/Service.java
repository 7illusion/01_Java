package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class Service {
	
	Scanner sc = new Scanner(System.in);

	
	List<Book>book =new ArrayList<>();
	
	public void display() {
		
		int num = 0;
		
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1.도서 등록");
			System.out.println("2.도서 조회");
			System.out.println("3.도서 수정");
			System.out.println("4.도서 삭제");
			System.out.println("5.즐겨찾기 추가");
			System.out.println("6.즐겨찾기 삭제 ");
			System.out.println("7.즐겨찾기 조회");
			System.out.println("8.추천도서 뽑기");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴를 입력하세요");
			
			try {
				num = sc.nextInt();
				
				switch (num) {
				case 1:/*도서등록*/  break;
				case 2:/*도서조회*/  break;
				case 3:/*도서수정*/  break;
				case 4:/*도서삭제*/  break;
				case 5:/*즐겨찾기 추가*/  break;
				case 6:/*즐겨찾기 삭제*/  break;
				case 7:/*즐겨찾기 조회*/  break;
				case 8:/*추천도서 뽑기*/  break;
				case 0:/*프로그램 종료*/  break;

				default:
					break;
				}
				
			} catch (Exception e) {
				System.out.println("\n에러 : 0~8까지의 정수를 입력하세요");
				System.out.println();
					
			}
				
		} while (num == 0);
		
	}

	public void addBook() {
		System.out.println("====도서 등록====");
		System.out.print("도서 번호 : ");
	    int bookNumber = sc.nextInt();
	    
	    System.out.print("도서 제목 : ");
	    String bookSus = sc.next();
	    
	    System.out.print("도서 저자 : ");
	    String author = sc.next();
	    
	    System.out.print("도서 가격 : ");
	    int price = sc.nextInt();
	    
	    System.out.print("도서 출판사 : ");
	    String pub = sc.next();
	    
		
	}
	
	
	

}



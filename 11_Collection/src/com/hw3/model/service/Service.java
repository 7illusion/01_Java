package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class Service {
	
	Scanner sc = new Scanner(System.in);

	Book book = new Book();
	
	List<Book>bookList =new ArrayList<>();
	
	List<Book> favList = new ArrayList<Book>(); //즐겨찾기 저장
	

	public Service() {
		bookList.add(new Book(1111,"세이노의 가르침","세이노",6480,"데이원"));
		bookList.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베게"));
		bookList.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		bookList.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		bookList.add(new Book(5555,"도둑맞은 집중력","요한 하리",16820,"어크로스"));
	}

	
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
			System.out.print("메뉴를 입력하세요 : ");
			
			try {
				num = sc.nextInt();
				
				switch (num) {
				case 1: addBook();  break;
				case 2: bookSeach(bookList);  break;
				case 3: updateBook();  break;
				case 4:   break;
				case 5:/*즐겨찾기 추가*/  break;
				case 6:/*즐겨찾기 삭제*/  break;
				case 7:/*즐겨찾기 조회map*/  break;
				case 8:/*추천도서 뽑기*/  break;
				case 0:/*프로그램 종료*/  break;

				default:
					break;
				}
				
			} catch (Exception e) { // 거의 대부분의 예외사항을 잡아줌 
				System.out.println("\n에러 발생 잘못입력하셨습니다");
				System.out.println();
					
			}
				
		} while (num != 0);
		
	}

	public void addBook() {
		System.out.println("====도서 등록====");
		System.out.print("도서 번호 : ");
	    int bookNumber = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.print("도서 제목 : ");
	    String tital = sc.next();
	    
	    System.out.print("도서 저자 : ");
	    String author = sc.next();
	    
	    System.out.print("도서 가격 : ");
	    int price = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.print("도서 출판사 : ");
	    String pub = sc.next();
	    
	    if(bookList.add(new Book(bookNumber,tital,author,price,pub))) {
	    	System.out.println("등록 성공");
	    	
	    }else {
	    	System.out.println("등록 실패");
	    }
	      
		
	}
	
	
	public void bookSeach(List<Book> bookList2) { // List<Book> list 을 넣으므로 어떤 List<Book> 을 처리 가능 재사용성 높아짐 
		for (Book book : bookList) {
			System.out.println(book);
		}
	
	}
	
	
	public void updateBook () {
		System.out.println("======도서 수정======");
		
		int bookInput = 0 ;
	
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		Book foundBook = null; //찾은 책을 저장할 변수 초기화
		for (Book book : bookList) { //bookList를 순회
			if(book.getBookNumber() == input) {
				foundBook = book ; // 일치하는 책을 foundBook에 저장
				break ; //찾으면 종료
			}
		}
		
		if (foundBook == null) {
			System.out.println("해당 도서를 찾을 수 없습니다");
			return ;
		}
		
		
	do {
			
			System.out.println("1.도서명");
			System.out.println("2.도서 저자");
			System.out.println("3.도서 가격");
			System.out.println("4.도서 출판사");
			System.out.println("0.수정 종료");
			System.out.print("어떤 정보를 수정하겠습니까? : ");
			bookInput = sc.nextInt();
			sc.nextLine();
			
			switch(bookInput){
			case 1 :
				System.out.println("===도서명 수정===");
				System.out.print("수정할 도서명을 입력하세요 : ");
				String title = sc.nextLine(); 
				book.setBookSus(title);
				break ;
				
			case 2 :
				System.out.println("===도서저자 수정===");
				System.out.print("수정할 저자명을 입력하세요");
				String author = sc.nextLine();
				book.setAuthor(author);
				break;
			case 3 :
				System.out.println("===도서 가격 수정===");
				System.out.print("수정할 가격을 입력하세요");
                int price = sc.nextInt();
				book.setPrice(price);
				break;
			case 4 :
				System.out.println("===도서 출판사 수정===");
				System.out.print("수정할 출판사를 입력하세요");
				String pup = sc.nextLine();
				book.setPub(pup);
				break;
			case 0 :
				System.out.println("===수정 완료===");
				break;
				default : System.out.println("메뉴를 선택하세요"); break ;
			}
			
	
	} while (bookInput != 0);	
		
		
	}
	
	
	public void deleteBook() {
		System.out.println("===도서 삭제===");
		bookSeach(bookList);
		
	}

}



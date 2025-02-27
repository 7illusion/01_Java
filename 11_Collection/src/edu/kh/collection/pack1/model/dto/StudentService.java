package edu.kh.collection.pack1.model.dto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Student>studentList = new ArrayList<>(); // 객체 Student 를 studentList 라는 이름의 리스트를 만듬 
	
	public StudentService() {
		
		studentList.add(new Student("홍길동",23,"서울시 중구",'m',100));
		studentList.add(new Student("고영희",26,"경기도 안산시",'F',100));
		studentList.add(new Student("강아지",25,"서울시 강남구",'M',80));
		studentList.add(new Student("오미나",24,"충북 제천시",'F',90));
		studentList.add(new Student("박쥐히",23,"서울시 서대문구",'F',60));
		
	}
	
	/**
	 * 메서드 설명용 주석 
	 * alt + shift + j
	 * @author illusion
	 */
	public void displayMenu() {
	
		int menuNum = 0 ;
		
		do {
			System.out.println("======학생 관리 프로그램========");
			System.out.println("1.학생 정보 추가");
			System.out.println("2.학생 정보 전체 조회");
			System.out.println("3.학생 정보 수정");
			System.out.println("4.학생 정보 제거");
			System.out.println("5.이름으로 검색(일치)");
			System.out.println("6.이름으로 검색(포함)");
			System.out.println("7.나이순으로 정렬"); //comparable 사용 
			System.out.println("8.이름순으로 정렬"); //comparator 사용 
			System.out.println("0,프로그램 종료");
			
			System.out.print("번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				sc.nextLine(); //개행문자 제거용
				switch (menuNum) {
				case 1: System.out.println(addStudent()); break;
				case 2: selectAll(); break;
				case 3: System.out.println(updateStudent());break;
				case 4: /*removeStudent*/ break;
				case 5: /*serchName1*/break;
				case 6: /*serchName2*/break;
				case 7: /*sortByAge*/break;
				case 8: /*sortByName*/break;
				case 0:System.out.println("프로그램 종료"); break ;	
				default:System.out.println("있는 번호만 입력");
					
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해 주세요");
				sc.nextLine();
				
				menuNum = -1 ;// 첫반복시 잘못 입력하는 경우 
				//menuNum이 초기값인 0을 가지고 있어 반복문이 종료 
				//이를 방지하기 위해서 임의값 -1 대입 
				
			}
			
		} while (menuNum != 0); // 0이 들어오면 멈추고 아니면 계속 반복
		
		
	}
	
	/**
	 * 1.학생 정보 추가 메서드 
	 * @return 삽입 성공시 "성공" , 실패시 "실패" 문자열 반환
	 */
	public String addStudent() {
		
		System.out.println("=========학생 정보 추가============");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사는 곳 : ");
		String region = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(studentList.add(new Student(name,age,region,gender,score))) {
			return "성공" ;  //추가됬다면 성공
		}else {
			return "실패" ;
			
		}
		
	}
	

	/**
	 * 2.학생 전체 조회 메서드
	 * List 가 비어있는 경우 "학생 정보가 없습니다" 출력 
	 * 있는 경우 전체 학생 출력 
	 */
	public void selectAll() {
		System.out.println("======학생 전체 조회======");
	//studentList 가 비어있는 지 확인 
	//List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
		
	/*
	 * if(studentlist.size() == 0 ) 
	 * boolean List.isEmpty() 
	 */
		
		if(studentList.isEmpty()) {//컬렉션이 비어 있다면 true 반환 
		System.out.println("학생 정보가 없습니다");
		 //현재 메서드 종료하고 호출한곳으로 돌아감

		}
		
	
		int index = 0; // 
		for(Student std : studentList ) {
			System.out.print((index++) + "번 : "); // 0번부터 뽑아야 하니깐 
			System.out.println(std);
		}
	
	}
	
	/**
	 *3. 학생 정보 수정 메서드 
	 * 
	 * 학생 정보가 studentList에 하나라도 있는지 검사 
	 * 없다면 찾을 수 없다 문자열 반환 
	 * 인데스 번호로 학생을 수정하려고하는데 
	 * 입력된 숫자가 0보다 작은지 검사 
	 * 작다면 음수는 입력 불가 반환
	 * studentList 범위 내 인덱스번호인지 검사 , 초과했다면 범위를 넘어섬 반환 
	 * 
	 * 수정할떄 인덱스 번째에 저장된 학생정보 수정 전 정보를 출력
	 * 이름....점수 수정할 값 입력받기
	 * 
	 * 수정이 완료되었다면 000의 정보가 변경되었습니다
	 * 
	 * @return
	 */
	public String updateStudent() {
		
		System.out.println("====학생 정보 수정=====");
		
		System.out.print("인덱스 번호 : ");
		
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다" ;
		}else if(index < 0) {
			return "음수는 입력할 수 없습니다" ;
			
		}else if (index >= studentList.size()) {
			return "범위내 값을 입력하세요" ;
		}else {
			//수정 코드 작성 
			//1.index번쨰에 저장된 학생정보 출력
			System.out.println(index + "번쨰에 저장된 학생 정보");
			System.out.println(studentList.get(index)); //index번호에 있는 정보 가져옴
			
			//2.수정
			System.out.println("=========학생 정보 추가============");
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("사는 곳 : ");
			String region = sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			//입력받은 인데스번째에 수정할 학생정보를 세팅 -> 수정 
			//인데스번쨰에 있던 기존 학생 정보가 반환되고 ,그 객체를 temp에 저장 
	   Student temp =	studentList.set(index, new Student(name,age,region,gender,score)); 
	 
	   return temp.getName() + "의 정보 수정 완료" ;
			
		}
		
	}
	

	/**
	 * 4.학생 정보 제거 메서드 
	 * 수정과 같은 검사 후 삭제 시
	 * 정말 삭제하시겠습니까? (Y/N) : 
	 * 입력 받으면 객체 삭제 후 000의 정보 제거 리턴 
	 * n 는 취소 리턴 
	 * @return
	 */
	public String removeStudent() {
		//student List.remove(int index) 
		//리스트에서 index번쨰 요소를 제거 
		//이떄 제거되 요소가 반환 
		

		System.out.println("====학생 정보 수정=====");
		
		System.out.print("인덱스 번호 : ");
		
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다" ;
		}
		if(index < 0) {
			return "음수는 입력할 수 없습니다" ;
		}
		if (index >= studentList.size()) {
			return "범위내 값을 입력하세요" ;
		}
		
		System.out.print("정말 삭제 하시겠습니다? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0); // 문자열로 받고. 대문자 소문자 상관 없이 하고. 그 문자열을 char 로 변경 
		
		if(ch == 'y') {
			Student temp  = studentList.remove(index);
			return temp.getName() + "의 정보가 제거되었습니다" ;
		}
		
		return "취소" ;
			
	}
	
	
	
	
	//Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환 

}

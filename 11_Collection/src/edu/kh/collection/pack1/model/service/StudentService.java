package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

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
			System.out.println("5.이름으로 검색(일치)"); // 완전 일치 검색 정확히 입력해야함
			System.out.println("6.이름으로 검색(포함)"); // 한글자만 포함해도 다 검색
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
				case 4: System.out.println(removeStudent()); break;
				case 5:  serchName1();break;
				case 6:  serchName2(); break;
				case 7:  sortByAge(); break;
				case 8:  sortByName();break;
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
		if (index >= studentList.size()) {// 배열은 lengh 이지만 컬렉션은 size 로 길이를 측정  
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

	/**
	 * 5.완전 일치 검색 이름
	 * 검색할 이름을 입력받아 studentList에서 꺼내온 Student 객체의name 값이 같은지 비교
	 * 
	 * 일치하는 경우 student 객체 출력
	 * 일치한는게 없다면 "검색 결과가 없음" 출력
	 */
	public void serchName1() {
		System.out.println("=======이름 완전 일치==========");
		
		System.out.print("검색할 이름 : ");
		String input = sc.next();
		
		boolean flag = true ;
		
		for(Student std : studentList) {
			if(input.equals(std.getName())) {// 이름이 일치하는 경우
				System.out.println(std); // std.toString 과 같은 효과
				flag = false ;
			}
		}
		if(flag == true) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	/**
	 * 6.이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * 문자열 입력받아 studentList에서 꺼내온 
	 * Student 객체의 name 값에 포함되는 문자열인지 검사
	 * 포함하는 경우 student 객체 출력
	 * 포함한는게 없다면 "검색 결과가 없음" 출력
	 */
	public void serchName2() {

		System.out.println("=======이름 부분포함  일치==========");
		
		System.out.print("검색할 이름 : ");
		String input = sc.next();
		
		boolean flag = true ;
		
		//boolean String.contains(문자열) : String에 문자열이 포함되어있으면 true 아니면 false
		for(Student std : studentList) {
			if(std.getName().contains(input)) {// getName에 input이 포함되어있는냐 순서 중요
				System.out.println(std); // std.toString 과 같은 효과
				flag = false ;
			}
		}
		if(flag == true) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	/**
	 * 7.나이순으로 정렬 오름차순 정렬 
	 * 
	 * List를 정렬하는 방법
	 * 1.comparable 인터페이스 상속받아 compareTo 메서드 재정의
	 * Student Comparable 인터페이스를 상속받아 오버라이딩한 compareTo()에
	 * 정의한 대로 정렬됨
	 * 2.comparator 클래스에 의한 정렬 campare() 사용(익명 내부 클래스 이용)
	 * 익명 내부 클래스 : 이름이 없는 클래스를 즉성에서 선언해서 한번만 사용할 목적으로  작성
	 * 객체를 생성하면서 바로 구현 내용을 정의할 수 있음
	 * 익명 내부클래스 장점 
	 * -코드 간결화 (별도 클래스 작성 필요 x)
	 * -즉시사용 가능 정의하면 바로 객체화 됨 
	 * -지역화(특정 메서드 안에서만 필요할 떄)
	 */
	public void sortByAge() {
		
		Collections.sort(studentList) ;
		
		for(Student std : studentList){
			System.out.println(std);
		}
		
	}
	
	/**
	 * 8.이름에 따라 정렬 (가나다순)
	 */
	public void sortByName() {
		//익명 내부 클래스는 Comparator 인터페이스를 상속받아 구현한 구현체 (==클래스)
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				//이름 비교 
				return o1.getName().compareTo(o2.getName()) ; //가나다 순으로 나옴 
				//String형은 compareTo 로 비교
				//String.compareTo: 자바에서 객체를 비교하는 메서드 
				//String이 comparable을 상속받아 재정의 
				
				//comareTo() 두 객체를 비교하고 순서 결정
				//반환값 0같은 양수 왼쪽이 더 큼 음수 오른쪽이 더 큼 
				
			}
		});
		
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}
	
	
	//Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환 

}

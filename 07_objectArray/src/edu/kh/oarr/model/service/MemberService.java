package edu.kh.oarr.model.service;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	//속성 
	private Scanner sc = new Scanner(System.in); 
	
	//회원 가입한 사람의 정보를 저장해둘 참조변수 
	//멤버 5칸짜리 객체배열 선언 및 할당 
	private Member[] memberArr =new Member[5] ;//Member 의 정보가 들어올 수 있음 최대 5개 (참조형 변수(객체or string)가 들어올 예정)
                                                 // -> jvm 기본형 중 null 이 저장됨 
	//현재 로그인한 회원정보를 저장할 참조 변수 선언
	private Member loginMember = null ; 
	
	public MemberService() {	//기본 생성자 
		//memberArr 배열 0,1,2 인덱스에 초기화 
		memberArr[0] = new Member("user01","pass01" ,"홍길동", 30 ,"서울");
		memberArr[1] = new Member("user02","pass02" ,"게보린", 31 ,"경기");
		memberArr[2] = new Member("user03","pass03" ,"고니니", 41 ,"강원");
	} 
	
	
	//기능 메뉴 출력용 메서드 
	public void displayMenu() {
		int menuNum = 0; //메뉴 선택영 변수 
		
		do {
			System.out.println("====회원 정보 관리 프로그램 v2 =====");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보 조회");
			System.out.println("4.회원정보 수정");
			System.out.println("5.회원검색 (지역)");
			System.out.println("0.프로그램 종료 : ");
			System.out.print("메뉴 입력 :");
			menuNum = sc.nextInt();
			
			sc.nextLine();
			
	       switch (menuNum) {
		case 1:
			System.out.println(signUp()); //형태가 있는 메소드는 프린트 
			break;
        case 2:
			System.out.println(login());
			break;
        case 3:
	        System.out.println(selectMember());
	         break;
        case 4:
	        int result = updateMember();
	        if(result == -1) {
	        	System.out.println("로그인 후 이용바람");
	        }else if(result == 0) {
	        	System.out.println("회원정보 수정 실패");
	        }else {
	        	System.out.println("회원 정보 수정 확인");
	        }
	         break;
        case 5:
	         searchRegin();  //void 인 메소드는 그냥 호출 
	         break;
	    case 0:
  			System.out.println("프로그램 종료");
  			break;

		default:
			System.out.println("잘못입력했습니다. 다시 입력");
			break;
		}
			
		} while(menuNum != 0) ; // 0 이 되면 반복 종료 
	}
	
	public int emptyIndex() { 
	//memberArr의 비어있는 인덱스 번호를 반환해줄 메서드 
	// 단 , 비어 있는 인덱스가 없다면 -1 반환 
// memberArr 배열을 0 인덱스부터 끝까지 접근해서 참조한 값이 null인 경우의 인덱스를 반환 
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i ;
			} 
		}
		
// for 문을 수행했지만 return 이 되지 않은 경우 해당위치 코드 수행된다
	//-> return 되지 않았다 == 배열 빈칸이 없다 
		return -1 ;
	
	}
	
	
	
	//회원 가입용 메서드 
	public String signUp() {
		System.out.print("\n==========회원 가입============\n");
		//memberArr 에 빈 자리가 있는지 확인 
		//객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정 
		//-> 빈 공간의 빈엗스 번호를 얻어오기 
		int index = emptyIndex(); //위에서 받아온 인덱스 번호 반환받음 없다면 -1을 가지고 있을거임 
		if(index == -1) { 
			return "회원가입 불가 (사유 인원수 초과)" ;
		}else {// 회원가입 가능할떄 
			System.out.print("아이디 : ");
			String memberId = sc.next();
			System.out.print("비밀번호 : ");
			String memberPw = sc.next();
			System.out.print("비밀번호 확인 : ");
			String memberPw2 = sc.next();
			System.out.print("이름 : ");
			String memberName = sc.next();
			System.out.print("나이 : ");
			int memberAge = sc.nextInt();
			System.out.print("지역 : ");
			String region = sc.next();
			
			if (memberPw.equals(memberPw2)) { //비밀번호가 일치하면 회원가입 진행
				//memberArr의 비어있는 인데스에 대입 
				memberArr[index] = new Member(memberId,memberPw,memberName,memberAge,region) ;
				return "회원 가입 성공" ;
			}else { //불일치 경우 
				return "회원가입 실패 (비밀번호 불일치)" ;
			}
		}
		
		
	}
	
	//로그인 메서드 
	public String login() {
		System.out.println("\n======로그인=====");
		
		//1)아이디 ,비밀번호 입력받기 
		//2)memberArr 배열 내 요소를 순서대로 접근하여
		//2-1) 현재 접근한 요소가 null이 아닌지 확인 
		//2-2)회원정보가 있을경우 
		// -> 회원정보의 아이디 , 비밀번호가 입력받은 아이디 , 비밀번호가 같은지 비교 
		//2-3)같다면 로그인 회원 정보 객체를 참조할 변수 loginMember에 
		 //   현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사을 해라 
		//3) 로그인 성공/실패 여부에 다라 결과 값 반환 
		// -> 로그인 성공 : 홍길동님 환영합니다 . 
		// -> 로그인 실패 : 아이디 또는 비밀번호가 일치하지 않습니다
		System.out.print("아이디 :");
		String memberId = sc.next();
		System.out.print("비밀번호 :");
		String memberPw = sc.next();
		
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] != null) {
				if(memberArr[i].getMemberId().equals(memberId) &&
				   memberArr[i].getMemberPw().equals(memberPw))
				loginMember = memberArr[i] ; // 주소값 복사 
					break ; // 더이상 같은 아이디 비번호를 가진 사람은 없기 때문에 효율을 위해 브레이크 
			}
	
		}
		if(loginMember == null) { // 일치하는 회원 정보를 못얻음 실패 
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		}else {
			return loginMember.getMemberName() + "님 환영합니다.";
		}
			
	}
	
	//회원검색(지역) 메서드 
	public void searchRegin() {
		System.out.println("\n=====회원 검색(지역)=====");
		System.out.println("검색할 지역을 입력하세요 : ");
		String inputRegion =sc.next();
		
		//1) 배열의 모든 요소 순차 접근 
		//2)member[i] 요소가 null 인 경우 반복 종료
		//3)member[i] 요소가 null 이 아니라면
		//member[i]요소가 저장된 지역이 입력받은 지역과 같을경우 
		//배열요소에 저장된 객체의 회원 아이디 , 이름을 출력 
				
		boolean flag = true ; // 검색결과 신호용 변수 
		for (int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				break ; 
			}else {
				if (memberArr[i].getRegion().equals(inputRegion)) {
					System.out.printf("아이디 : %s\n 이름 : %s\n",memberArr[i].getMemberId(),memberArr[i].getMemberName());
					flag = false ;
				}
			}
		}
		
		
		//4) 못찾는 경우
		if(flag) {
			System.out.println("일치하는 지역이 없습니다");
		}
	
	}

	 
	//회원정보조회 메서드명 selectMember()  string
	public String selectMember() {
		System.out.println("\n=====회원정보 조회======");
		if(loginMember == null) {
			return "로그인 먼저 해주세요";
		}else {
			String str = "이름 :"+loginMember.getMemberName();
			str += "\n아이디 :" +loginMember.getMemberId();
			str += "\n나이 :" +loginMember.getMemberAge();
			str += "\n지역 :" +loginMember.getRegion();
			
			return str ;
			
		}
		
	}
	
	
	//회원정보 수정 메서드명 updateMember()  int 로그인이 되어있지 않으면 -1 반환 다른 경우 0반횐 같은경우 수정이 이루어짐 1 반환 
	public int updateMember() {
		System.out.println("\n======회원정보 수정========");
		if(loginMember == null) {
			return -1 ;
		}
		System.out.print("수정할 이름 입력 :");
		String inputName =sc.next();
		System.out.print("수정할 나이 입력 :");
		int inputAge =sc.nextInt();
		System.out.print("수정할 지역 입력 :");
		String inputRegion =sc.next();
		
		System.out.println("비밀번호 입력 :");
		String inputPass = sc.next();
		
		//비번확인 
		if(inputPass.equals(loginMember.getMemberPw())){
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputRegion);
			return 1 ;
		}else {
			return 0 ;
		}
		
	}


}

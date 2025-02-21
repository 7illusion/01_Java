package edu.kh.oop.method.modle.service;

import java.util.Scanner;

import edu.kh.oop.method.modle.vo.Member;

public class MemberService {
	
	//속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null ; //가입한 회원의 정보를 저장할 변수 
	
	private Member loginMember = null ; //로그인한 회원의 정보를 저장할 변수 
	
	
	
	//기능 (생성자,메서드)

	
	//메뉴 화면 출력 기능 
    public void displayMenu() { // 몇번 반복 할지 모르기 떄문에 while
    	int menuNum = 0 ;
    	
    	//무조건 한번 실행 do while
    	do {
			System.out.println("========회원 정보 관리 프로그램 ========");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원 정보 조회");
			System.out.println("4.회원 정보 수정");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt(); // 무슨 숫자 입력 받았는지 판단 
			sc.nextLine(); //입력 버퍼에 남은 개행문자 제거용 
			
			switch (menuNum) {
			case 1: //내가 호출한 메서드가 return 하는 값 잘 생각하기 
				System.out.println(singUp()); 
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
 					System.out.println("로그인 후 이용가능");
 				}else if(result == 0) {
 					System.out.println("수정 실패 (비밀번호 불일치)");
 				}else {
 					System.out.println("회원 정보 수정되었습니다.");
 				}
 				break;
             case 0:
 				System.out.println("프로그램 종료");
 				break; 				
			default: System.out.println("잘못 입력했습니다 . 메뉴에 있는 번호만 입력해주세요");
				break;
			}
			
		} while (menuNum != 0);  // 0이 입력되면 반복 종료 1
    		
    }
    
    public String singUp() { //메서드 정의 
		System.out.println("\n*********회원 가입*********");
		
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
		
		//비밀번호 , 비밀번호 확인이 일치하면 회원가입
		//일치하지 않으면 회원가입 실패 
		
		if( memberPw.equals(memberPw2)) { // 비밀 번호 일치하는 경우
			
			//회원가입
			//새로운 회원 객체가 생성 
			// -> member 클래스 이용해서 새로운 객체 생성 
			// ->매개변수 생성자 이용 
			memberInfo =new Member(memberId, memberPw, memberName, memberAge); //Member  heap 영역에 객체 생성 
			
			
			return "회원 가입 성공";  // 문자열로 리턴 해주고 있기 떄문에 void -> string 
			
		}else {//일치 안하는 경우 
			return "회원가입 실패(비밀번호 불일치)";
		}	
		
	}
    
    
    public String login() {
    	
    	System.out.println("\n*********로그인*********");
    	
    	//회원가입 했는지 확인 memberInfo 가 참조하는 값이 없다면 즉 null 인지 아닌지 확인 
    	if(memberInfo == null) { //null이면 안한 경우 
    		
    		return "회원가입부터 먼저 해주세요";
    		// -> 현재 메서드 종료하고 값을 가지고 해당 메서드를 호출한쪽으로 되돌아감
    	}
    	
    	//회원가입을 했다 하면
    	
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		//회원 정보가 있는 memberInfo 가 참조한느 Member 객체에 
		//저장된 아이디 , 비밀번호가 
		//입력된 아이디 , 비밀번호와 같으면 로그인 성공 아니면 불일치 리턴 
		
		if(memberInfo.getMemberId().equals(memberId) &&  memberPw.equals(memberInfo.getMemberPw())){
			//로그인 한 사람의 정보를 기억시키기 
			//loginMember 에 현재 로그인한 사람의 정보를 기억시키기 
			// ==loginMember 에 memberInfo가 참조하고있는 객체의 주소 대입 
			loginMember = memberInfo ; // 얕은 복사 회원강비 정보를 loginMember에 대입하여
			                            //어떤 회원이 로그인했는지를 구분할 수 있게함 
			return  loginMember.getMemberName() +"님 환영합니다.";
			
		}else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
		}
    	
    }
    
    
    public String selectMember() {
    	//로그인 했는지 확인
        //했다면 현재 로그인한 사람의 정보를 저장하고 있는 객체에서 
        //이름,아이디 ,나이만 정보가져오기
        //로그인을 안했다면 로그인 해주세요 출력 
        
    	System.out.println("\n*********회원 정보 조회*********");
    	
    	if(memberInfo == null) {
    		return "로그인 먼저 해주세요";
    	}else {
    		return "이름 : " + memberInfo.getMemberName() + "\n" 
    			 +"아이디 : " + memberInfo.getMemberId() + "\n" 
    			 +"나이 : " + memberInfo.getMemberAge() + "세"; 
    	}
    	
    }

    
    public int updateMember() { //회원 정보 수정 기능 
       System.out.println("\n*********회원 정보 수정*********");
       
       //1)로그인 여부 판별
       //로그인이 되어있지 않으면 -1 반환 
       if(loginMember == null) {
    	   return -1 ;
       }
       
       //2) 로그인이 되어있을 떄
       //-1 수정할 회원 정보 입력 받기 (이름,나이)
       System.out.print("수정할 이름 입력 : ");
       String inputName =sc.next();
       
       System.out.println("수정할 나이 입력 : ");
       int inputAge = sc.nextInt();
       
       System.out.println("비밀번호 : ");
       String inputPw = sc.next();
       
       if(inputPw.equals(loginMember.getMemberPw())) {
    	 //-2비밀번호를 받아서 현재 로그인한 회원의 비밀번화와 일치하는지 확인
           //-> 비밀번호가 일치하는 경우 , 로그인한 회원의 이름과 나이 정보를 
           //입력받은 값으로 변경 후 1 반환
    	   loginMember.setMemberName(inputName);
           loginMember.setMemberAge(inputAge);   
           return 1 ;
    	   
       }else { //-> 비밀번호가 다를 경우 0 반환 
    	   return 0 ;
       }
       
      
       
       
    	
    }
    
    
    
    
	
}





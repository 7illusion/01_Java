package edu.kh.oarr.model.vo;

public class Member {
	
	//속성과 기능 
	//속성에 작성 ->필드,멤버변수
	private String memberId ;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	
	//기능 (메서드 ,
	//생성자 작성 규칙 (기본생성자, 매개변수 생성자 )
	//1. 생성자 이름은 클래스명과 같다
	//2. 반환형이 없다 
	//기본 생성자는 컴파일러가 자동으로 생성해주지만 
	//매개변수 생성자가 있다면 만들어 줘야한다 
	
	public Member () { // 기본 생성자 컨트롤 + 스페이스 + 엔터 자동생성 
		
	}

//매개변수 생성자 alt + 엔터 + s 로 작동생성 
// 오버로딩 : 같은 클래스내에 같은 이름의 메서드가 필요할떄 (기본적으로 이름이 같아야함) 매개변수의 개수 , 순서 , 타입이 달라야한다 
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	//필드에 선언되 멤버면수들이 갭슐화 원칙에 의해서 private 으로 선언 
	//직접 접근이 불가 하기에 getter/setter을 이용하여 간접접근을 하여 값을 세팅 및 얻어올 수 있도록 해줌 
	// 반환형(string) : string 자료형인 값을 되돌려줌 -> 나를 호출한 곳으로 memberId 를 가지고 되돌아감 return 을 만나면 해당 메서드 종료 		
	public String getMemberId() {
		return memberId;
	}
 //반환형 void 는 반환값이 없다 -> 필드에 세팅해주는 역할 //void 로 작성된 메서드는 아래에 return이 생략되어 잇음 
	//                                                        작성을 안해도 됨 
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	

}

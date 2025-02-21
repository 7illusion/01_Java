package edu.kh.oop.method.modle.vo;

public class Member { // 회원 클래스 
	//속성 + 기능 필요 
	
	//필드(속성)

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	
	//생성자(기능)
	
    public Member() {} // 기본 생성자 ctrl + 스페이지 + 엔터 로 만들수 있음 컴파일러가 자동으로 생성해주지만 
    	              // 매개변수 생성자가 하나라도 있다면 기본생성자 자동으로 생성 안해주기 때문에 만들어 주자 
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) { //alt + shift + s using 필드 클릭 
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	

	//메서드(기능)
	
	//getter and setters 
		public String getMemberId() {
			return memberId;
		}
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
}

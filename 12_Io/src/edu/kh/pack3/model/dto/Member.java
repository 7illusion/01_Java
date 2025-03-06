package edu.kh.pack3.model.dto;

import java.io.Serializable;

//Serializable 인터페이스 - 추상메서드가 하나도 없는 인터페이스로 
//상속반 받아도 입출력 시 직렬화가 가능하다 라는 의미만 제공
// 마커 인터페이스 
// implements Serializable 만 작성하면 -> 직렬화 
public class Member implements Serializable {

	
	private String id ;
	private String pw ;
	private String name ;
	private int age ;
	
	public Member() {}

	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

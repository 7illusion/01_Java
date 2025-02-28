package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student> { // 정렬을 위한 comparable 상속 
	
	private String name ;
	private int age ;
	private String region ;
	private char gender ;
	private int score ;
	
	public Student() {}
	
	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 지역 : " + region + ", 성별 : " + gender + ", 점수 : "
				+ score ;
	}

	@Override
	public int compareTo(Student othor) { 
		//compareTo : 두 객체를 비교하고 순서를 결정
		//반환값 : 0(같음), 양수(왼쪽 객체가 크다는 뜻) , 음수(왼쪽 객체가 작다는 뜻)
		
		//현재객체의 나이 - 다른객체의 나이 
		//값이 양수면 현재객체의 나이가 더 크다 
		//값이 음수면 현재객체의 나이가 더 적다 
		return  this.age - othor.age;  // 나이를 기준으로 오름차순 정렬 (작 -> 큰) 
		//return other.age - this.age -> 내림차순 정렬 (큰 -> 작) 
	}
	
	
	
	

}

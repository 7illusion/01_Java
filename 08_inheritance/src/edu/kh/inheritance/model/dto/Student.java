package edu.kh.inheritance.model.dto;

public class Student extends Person{ //student 클래스에 person 클래스 내용을 확장 및 연장한다 
	//-> student 클래스에 person 클래스의 필드 ,메서드를 추가하여 확장 
	
	//상속 방법 : 자식 extends 부모 
	/*
	 * private String name ; private int age ; private String nationality ;
	 */  // person 에서 이름 나이 국적을 받아 오기 떄문에 없어도 받아 올 수 있다 
	
	private int grade ;
	private int classRoom ;
	
	public Student() {}

	/*
	 * public Student(int grade, int classRoom) { super(); // ->person 클래스를 가리킴
	 * this.grade = grade; this.classRoom = classRoom; }
	 */
	
	
	//super(); 부모의 기본생성자 / super(매개변수) 부모의 매개변수생성자 
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
		// 안되는 이유 this는 자신만 가르킴 student 자식의 grade classRoom 만 this가 쓰인다 
		//this.name = name ;
		//this.age = age ;
		super(name, age, nationality); //person이 가지고 있는 매개변수도 가져옴 객체에서 가장 상단(먼저)에 있어야함 먼저 생성되어야 하기 떄문에  
		this.grade = grade;
		this.classRoom = classRoom;
	}




	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getAge() { return age; } public void
	 * setAge(int age) { this.age = age; } public String getNationality() { return
	 * nationality; } public void setNationality(String nationality) {
	 * this.nationality = nationality; }
	 */
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
		public String toString() { //person 에서온 toSting임 person 에 있는 toString 으로 시작 함 
			return super.toString() + " / " + classRoom +" / " +grade ; 
		}
	//이름/나이/국적/학년/반  을 한번에 출력 

}

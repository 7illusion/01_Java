package com.hw1.model.vo;

public class Person {
	
	protected String name ; //상속받은 후손클래스에서 직접 접근 가능 부모필드에 직접 접근 가능 
	private int age ;
	private double height ;
	private double weight ;
	
	public Person() {	}

	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {  // 프린트f 같은 기능을 해준다 string.format 
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", 
				               name ,age , height ,weight ) ;
	}
	
}

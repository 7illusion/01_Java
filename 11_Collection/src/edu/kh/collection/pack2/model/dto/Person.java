package edu.kh.collection.pack2.model.dto;

import java.util.Objects;

public class Person {
	
	private String name ;
	private int age ;
	private char gender ;
	
	public Person() {}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	//동일 비교 : hashCode 메서드 오버라이딩을 한다 
	@Override
	public int hashCode() {
		//필드에 저장된 값을 이용해서 hashCode 생성 : 객체별 식별코드가 hashcode임 
		return Objects.hash(age, gender, name);
	}
	
	//동등비교 : equals 메서드 오버라이딩 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	//객체가 같다(동일, 동등 하다로 나누어짐)
	//-동일 가르키는 주소가 같을떄 hashCode는 주로 이런 객체를 식별하는데 사용 얕은복사 
	//동등 가지고 있는 값이 같을떄 메모리 주소가 다르더라도 , 각 객체의 내부값들이 같다면
	//동일한 객체로 간주하는 경우을 말함 equals() 메서드는 이러한 객체가 같은지 판단할떄 사용  깊은복사 

}

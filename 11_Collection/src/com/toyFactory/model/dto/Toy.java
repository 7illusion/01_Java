package com.toyFactory.model.dto;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Toy {
	
	private String toyName ;
	private int age ;
	private int price;
	private String color ;
	private String madeNumber ;
	private Set<String>materials = new TreeSet<String>(); //입력받은걸 자동 정렬 중복 저장되지 않게
	
	public Toy() {}

	public Toy(String toyName, int age, int price, String color, String madeNumber, Set<String> materials) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.madeNumber = madeNumber;
		this.materials.addAll(materials);
	}

	public void addMaterial(String material) {
		materials.add(material);
	}

	public String getToyName() {
		return toyName;
	}

	public void setToyName(String toyName) {
		this.toyName = toyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeNumber() {
		return madeNumber;
	}

	public void setMadeNumber(String madeNumber) {
		this.madeNumber = madeNumber;
	}

	public Set<String> getMaterials() {
		return materials;
	}

	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, madeNumber, materials, price, toyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(madeNumber, other.madeNumber)
				&& Objects.equals(materials, other.materials) && price == other.price
				&& Objects.equals(toyName, other.toyName);
	}
	
	

}

package com.demo.test.polymorphic;

public class Person {
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void eat() {
		System.out.println("想吃什么？");
	}
	
	public void drink() {
		System.out.println("想喝什么？");
	}
	

}



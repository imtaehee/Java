//package jb04.part02;

public class Human {
	
	String name;
	int age;
	
	public Human() {
		System.out.println("Human calss default Constructor");
	}
	public Human(String str) {
		System.out.println("Human class Constructor");
		name = str;
	}
	
	public void setName(String str) {
		name = str;
	}
	public void setAge(int b) {
		age = b;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}

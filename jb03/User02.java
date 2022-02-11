//package jb03.part08;

public class User02{
	String name;
	int javaLevel;

	//Constructor
	public User02(){
		System.out.println("Constructor Method");
		name = "ȫ�浿";
	    javaLevel = 0;
	}

	//getter Method difinition
	public String getName(){
		return name;
	}
	public int getJavaLevel{
		return javaLevel;
	}

	//main Method
	public static void main(String[] args){
		System.out.println("===============================");
		User02 user = new User02();
		System.out.println("===============================");

		/*
		System.out.println("===============================");
		User01 user;
		System.out.println("===============================");
		user = new User01();
		System.out.println("===============================");
		new User01;
		System.out.println("===============================");
	*/

	    System.out.println("name:" + user.getNmae());
		System.out.println("javaLevel:" + user.getJavaLEVEL());
	}
}

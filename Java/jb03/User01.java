//package jb03.part08;

/*
Constructor 의미 이해
1. 인스턴스 생성시 new A()의 의미이해
2. new 와 같이 사용되는 특수한 행위를 하는 method 이해
3. Constructor 주 작업, 용도는?
*/

public class User01{
	String name = "홍길동";
	int javaLevel = 0;

	//default Constructor
	//1. ClassNme == MethodName
	//2. return Type 없다.
	public User01(){
		System.out.println("Constructor Method");
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
		User01 user = new User01();
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

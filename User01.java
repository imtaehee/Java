//package jb03.part08;

/*
Constructor �ǹ� ����
1. �ν��Ͻ� ������ new A()�� �ǹ�����
2. new �� ���� ���Ǵ� Ư���� ������ �ϴ� method ����
3. Constructor �� �۾�, �뵵��?
*/

public class User01{
	String name = "ȫ�浿";
	int javaLevel = 0;

	//default Constructor
	//1. ClassNme == MethodName
	//2. return Type ����.
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

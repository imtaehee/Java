package jb04.part07;

/*
 * Other는 Father와 같은 package에 존재
 */

public class Other {
	String name="홍길동";
	String job=new String("개발자");
	//위의 String Data Type의 name, job 상태값을 정의한 것을 이해
	//Other.class Has A String.class (~~ Has A~~ : Association Relation)
	//아래의 Father Data Type과 Other.class 간의 관계는
	
	Father owner = new Father();  //Father 인스턴스 생성
	
	public Other() {
		System.out.println(this.owner.name);    
		//==>public String name = "홍길동";
		System.out.println(owner.bank);    
		//==>public String bank = "한양은행";
		System.out.println(owner.branch);    
		//==>public String name = "역삼동지점";
		//System.out.println(f.password);
		//==>private int password=1234;
		
		//==>Field(상태정보)는 Method(행위)를 이용접근
		System.out.println("은행 비밀번호: "+this.owner.getPassword(0));
	}

}

//package jb04.part07.outer;

//Other1은 Father과 다른 package 에 존재, 관계가 없다

public class Other1 {
	
	jb04.part07.Father unknown = new jb04.part07.Father();
	//Father 인스턴스 생성
	
	public Other1() {
		System.out.println(this.unknown.name);  //public String name="홍길동";
		//System.out.println(f.bank);      //protected String bank="한양은행";
		//System.out.println(f.branch);  //String branch="역삼동지점";
		//System.out.println(f.password);  //private int password=1234;
		
		//Field는 Method를 이용접근
		System.out.println(this.unknown.getBranch());
		System.out.println(unknown.getPassword(0));
	}
}
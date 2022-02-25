//package jb05.part07;

abstract class BusCharge {
	
	String section;
	
	public BusCharge() {
	}
	public BusCharge(String section) {
		this.section=section;
	}
	
	public void information() {
		System.out.println("버스요금안내");
	}
	//==>사용되지 않으며 하위클래스에 OverRiding을 강제하는 추상메서드 정의
	public abstract void charge();
}

//abstract class 상속 시 abstract method 필히 재정의(OverRiding)
//해야함 (강제성)
class Student extends BusCharge{
	public Student() {
		super("학생");
	}
	public void charge() {
		System.out.println("300원");
	}
}

//abstract class 상속 시 abstract method 필히 재정의(OverRiding)
//해야함 (강제성)
class Adult extends BusCharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}

//abstract class 상속 시 abstract method 필히 재정의(OverRiding)
//해야함 (강제성)
class Old extends BusCharge{
	public Old() {
		super("어르신");
	}
    public void charge() {
		System.out.println("공짜");
	}
}

public class Display{
	public static void main(String args[]) {
		
		//상위 레퍼런스로 하위 인스턴스를 참조가능(묵시적 형변환/ is a)
		//abstract class는 객체생성 불가 그러나 type 선언은?
		BusCharge bc1=new Student();  //Student b1=new Student();
		BusCharge bc2=new Adult();  //Student b2=new Adult();
		BusCharge bc3=new Old();  //Student b3=new Old();
		
		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();
		
		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();
		
		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
		
	/* <<구현2>> 아래의 구현에서 컴파일시 에러
	 * 문제가 발생한 이규
	 * 문제를 해결하여 출력이 될 수 있도록 구현수정
	 * ==>힌트 : CastingComplete.java의 세번째 이해하기
	 *          casting 연산자 사용한 이유는?
	 *          
	 *Free[] fee=new Fee[3];
	 *fee[0]=new Student();
	 *fee[1]=new Adult();
	 *fee[2]=new Old();
	 *
	 *for(int i=0;i<fee.length;i++){
	 *fee[i].information();
	 *System.out.print(fee[i].section);
	 *fee[i].charge();
	 *}
	 */
    }
}

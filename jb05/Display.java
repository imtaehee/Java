//package jb05.part05.test04;

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
		
		//위의 코딩과 아래코딩 비교
		//반복된 부분 없는지
		//같은 data type 묶음(배열 array) 일괄적으로 관리할 수 없는지
		BusCharge[] bc=new BusCharge[3];
		bc[0]=new Student();   
		//BusCharge bc1=new Student(); Student b1=new Student();
		bc[1]=new Adult();   
		//BusCharge bc2=new Adult(); Adult b2=new Adult();
		bc[3]=new Old();   
		//BusCharge bc3=new Old(); Old b1=new Old();
		
		for(int i=0; i<bc.length; i++) {
			bc[i].information();
			System.out.print(bc[i].section);
			bc[i].charge();
		}
		
	}
}
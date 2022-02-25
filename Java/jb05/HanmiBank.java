//package jb05.part08;

public class HanmiBank extends Bank implements Deposit,PayOut{
	public HanmiBank(){
	}
	public HanmiBank(String name){
		super(name);
	}

	public void display(){
		System.out.println("은행명: "+this.getName());
	}
	public void deposit(int money){
		System.out.println(money+ "를 입금합니다.");
	}
	public void payOut(){
		System.out.println(money+ "를 출금합니다.");
	}

	public static void main(String args[]){
		HanmiBank hb=new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//interface 내부에 선언된 Field 의미이해
		System.out.println(Deposit.deposit);  //static 접근방식은?
		System.out.println(hb.payOut);  //static 접근방식은?

		//Field의 상태값 변경해보기
		//Deposit.depsit="입금";
		//PayOut.payOut="출금";
		//==>compile error, interface에 선언되는 변수는 final static의 특징
	}
}

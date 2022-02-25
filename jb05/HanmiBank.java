//package jb05.part08;

public class HanmiBank extends Bank implements Deposit,PayOut{
	public HanmiBank(){
	}
	public HanmiBank(String name){
		super(name);
	}

	public void display(){
		System.out.println("�����: "+this.getName());
	}
	public void deposit(int money){
		System.out.println(money+ "�� �Ա��մϴ�.");
	}
	public void payOut(){
		System.out.println(money+ "�� ����մϴ�.");
	}

	public static void main(String args[]){
		HanmiBank hb=new HanmiBank("�ѹ�����");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//interface ���ο� ����� Field �ǹ�����
		System.out.println(Deposit.deposit);  //static ���ٹ����?
		System.out.println(hb.payOut);  //static ���ٹ����?

		//Field�� ���°� �����غ���
		//Deposit.depsit="�Ա�";
		//PayOut.payOut="���";
		//==>compile error, interface�� ����Ǵ� ������ final static�� Ư¡
	}
}

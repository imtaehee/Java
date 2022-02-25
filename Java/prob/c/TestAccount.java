//package c.modeling.ex02;

/*
Account class
���¹�ȣ�� ��Ÿ���� accNo�����Ϳ� �ܰ� ��Ÿ���� balance ������
�Լ� �Ա� save, ��� deposit , �ܰ�Ȯ�� getBalance,���¹�ȣ Ȯ���ϴ� getAccNo 

������
078-3762-293 ���°� �����Ǿ����ϴ�.
078-3762-293 ������ �ܰ�� 0�����Դϴ�.
078-3762-293 ���¿� 100������ �ԱݵǾ����ϴ�.
078-3762-293 ������ �ܰ�� 100�����Դϴ�.
078-3762-293 ���¿� 30������ ��ݵǾ����ϴ�.
078-3762-293���¿� �ܰ�� 70�����Դϴ�.
*/

class Account{
	
	private String accNo;
	private int balance;
	int money;

	public Account(String accNo){
		this.accNo=accNo;
		System.out.println(accNo+ "���°� �����Ǿ����ϴ�.");
	}

	public int save(int money){
		balance += money;
		System.out.println(accNo+ "���¿� "+money+ "������ �ԱݵǾ����ϴ�.");
		return balance;
	}
	public int deposit(int money){
		balance -= money;
		System.out.println(accNo+ "���¿� "+money+ "������ ��ݵǾ����ϴ�.");
		return balance;
	}

	public String getAccNo(){		
		return accNo;
	}
	public int getBalance(){
		return balance;
	}
}


public class TestAccount{
	public static void main(String[] args) throws Exception{

		String accNo=null;
		int balance=0;
		Account accObj=new Account("078-3762-293");
		accNo=accObj.getAccNo();
		balance=accObj.getBalance();
		System.out.println(accNo+ "������ �ܰ��" +balance+ "�����Դϴ�.");

		accObj.save(100);
		balance=accObj.getBalance();
		System.out.println(accObj.getAccNo()+ "������ �ܰ��" +balance+ "�����Դϴ�.");

		accObj.deposit(30);
		balance=accObj.getBalance();
		System.out.println(accNo+ "������ �ܰ��" +balance+ "�����Դϴ�.");

	}
}

//package c.modeling.ex02;

/*
Account class
계좌번호를 나타내는 accNo데이터와 잔고를 나타내는 balance 데이터
함수 입금 save, 출금 deposit , 잔고확인 getBalance,계좌번호 확인하는 getAccNo 

실행결과
078-3762-293 계좌가 개설되었습니다.
078-3762-293 계좌의 잔고는 0만원입니다.
078-3762-293 계좌에 100만원이 입금되었습니다.
078-3762-293 계좌의 잔고는 100만원입니다.
078-3762-293 계좌에 30만원이 출금되었습니다.
078-3762-293계좌에 잔고는 70만원입니다.
*/

class Account{
	
	private String accNo;
	private int balance;
	int money;

	public Account(String accNo){
		this.accNo=accNo;
		System.out.println(accNo+ "계좌가 개설되었습니다.");
	}

	public int save(int money){
		balance += money;
		System.out.println(accNo+ "계좌에 "+money+ "만원이 입금되었습니다.");
		return balance;
	}
	public int deposit(int money){
		balance -= money;
		System.out.println(accNo+ "계좌에 "+money+ "만원이 출금되었습니다.");
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
		System.out.println(accNo+ "계좌의 잔고는" +balance+ "만원입니다.");

		accObj.save(100);
		balance=accObj.getBalance();
		System.out.println(accObj.getAccNo()+ "계좌의 잔고는" +balance+ "만원입니다.");

		accObj.deposit(30);
		balance=accObj.getBalance();
		System.out.println(accNo+ "계좌의 잔고는" +balance+ "만원입니다.");

	}
}

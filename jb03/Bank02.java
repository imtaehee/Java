/*
java Bank02 홍길동 한미은행
홍길동님의 주거래은행은 한미은행입니다.
현재금액은 0원입니다.

java Bank02 홍길동 한미은행 1 100
홍길동님의 주거래은행은 한미은행입니다.
100원 입금함
현재 100원 있습니다.

java Bank02 홍길동 하나은행 2 100
홍길동님의 주거래은행은 하나은행입니다.
100원 출금함
현재 -100원 있습니다.
*/

public class Bank02{
	
	int balance;
	int money;
	int command;
	String userName;
	String bankName;

	public Bank01(){
	}

	public Bank01(String s1, String s2){
		userName = s1;
		bankName = s2;
	}

	public Bank01(String s1, String s2, String s3, String s4){
		userName = s1;
		bankName = s2;
		command = Integer.parseInt(s3);
		money = Integer.parseInt(s4);
	}


}

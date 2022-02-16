//package jb04.part01;

public class Bank03 {
	int balance;
	int money;
	int command;
	String bankName;
	String userName;
	
	public Bank03() {
	}
	public Bank03(String[] str) {
		validate(str);  //인자값을 검증하는 method 호출
		initialize(str);  //Field를 초기화 시키는 Method 호출
		work();   //command가 입금,출금을 판단 deposit(),withdraw()호출 Method
		displayMoney();  //잔액을 표시하는 method
	}
	
	//인자값 검증 Method
	public void validate(String args[]) {
		if(!(args.length==2 || args.length==4)) {
			System.out.println("이름,주거래은행 또는 이름,주거래은행,옵션,금액 순서대로 입력하세요.");
			System.out.println("인자값이 2,4개 필요합니다.");
			System.exit(0);
		}
		if(args.length!=2 && Integer.parseInt(args[2])!=1 && Integer.parseInt(args[2])!=2) {
			System.out.println("옵션을 확인하세요 : 입금=1, 출금=2");
			System.exit(0);
		}
	}
	
	//Field 초기화 Method
	public void initialize(String[] value) {
		userName=value[0];
		bankName=value[1];
		if(value.length==4) {
			command=Integer.parseInt(value[2]);
			money=Integer.parseInt(value[3]);
		}
		System.out.println(userName+ "님의 주거래은행은 "+bankName+ "입니다.");
	}
	
	public void deposit() {
		balance +=money;
		System.out.println(money+ "원 입금함");
	}
	public void withdraw() {
		balance -=money;
		System.out.println(money+ "원 출금함");
	}
	public void work() {
		if(command==1) {
			deposit();
		}else if(command ==2) {
			withdraw();
		}
	}
	public void displayMoney() {
		System.out.println("현재 잔고는: "+balance+ "입니다.");
	}
	
	public static void main(String[] args) {
		new Bank03(args);
	}

}

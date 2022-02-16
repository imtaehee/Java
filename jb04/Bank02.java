//package jb04.part01;

public class Bank02 {
	int money;
	int balance;
	int command;
	String userName;
	String bankName;
	
	public Bank02() {
	}
	public Bank02(String[] str) {
		userName = str[0];
		bankName = str[1];
		command = Integer.parseInt(str[2]);
		money = Integer.parseInt(str[3]);
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
	
	public static void main(String args[]) {
		
		Bank02 b= new Bank02();
		
		if(args.length!=2 ||args.length!=4) {
			System.out.println("이름,주거래은행 또는 이름,주거래은행,옵션,금액 순서대로 입력하세요.");
			System.out.println("인자값이 2,4개 필요합니다.");
			System.exit(0);
		}
		
		System.out.println(args[0]+ "님의 주거래은행은" +args[1] +"입니다.");
		
		if(args.length!=2){
			int command=Integer.parseInt(args[2]);
			if(command!=1 ||command!=2) {
				System.out.println("옵션을 확인하세요 : 입금=1, 출금=2");
				return;
			}
			
			b=new Bank02(args);
			b.work();
	}
		b.displayMoney();

	}

}

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
		validate(str);  //���ڰ��� �����ϴ� method ȣ��
		initialize(str);  //Field�� �ʱ�ȭ ��Ű�� Method ȣ��
		work();   //command�� �Ա�,����� �Ǵ� deposit(),withdraw()ȣ�� Method
		displayMoney();  //�ܾ��� ǥ���ϴ� method
	}
	
	//���ڰ� ���� Method
	public void validate(String args[]) {
		if(!(args.length==2 || args.length==4)) {
			System.out.println("�̸�,�ְŷ����� �Ǵ� �̸�,�ְŷ�����,�ɼ�,�ݾ� ������� �Է��ϼ���.");
			System.out.println("���ڰ��� 2,4�� �ʿ��մϴ�.");
			System.exit(0);
		}
		if(args.length!=2 && Integer.parseInt(args[2])!=1 && Integer.parseInt(args[2])!=2) {
			System.out.println("�ɼ��� Ȯ���ϼ��� : �Ա�=1, ���=2");
			System.exit(0);
		}
	}
	
	//Field �ʱ�ȭ Method
	public void initialize(String[] value) {
		userName=value[0];
		bankName=value[1];
		if(value.length==4) {
			command=Integer.parseInt(value[2]);
			money=Integer.parseInt(value[3]);
		}
		System.out.println(userName+ "���� �ְŷ������� "+bankName+ "�Դϴ�.");
	}
	
	public void deposit() {
		balance +=money;
		System.out.println(money+ "�� �Ա���");
	}
	public void withdraw() {
		balance -=money;
		System.out.println(money+ "�� �����");
	}
	public void work() {
		if(command==1) {
			deposit();
		}else if(command ==2) {
			withdraw();
		}
	}
	public void displayMoney() {
		System.out.println("���� �ܰ��: "+balance+ "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		new Bank03(args);
	}

}

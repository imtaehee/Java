/*
java Bank02 ȫ�浿 �ѹ�����
ȫ�浿���� �ְŷ������� �ѹ������Դϴ�.
����ݾ��� 0���Դϴ�.

java Bank02 ȫ�浿 �ѹ����� 1 100
ȫ�浿���� �ְŷ������� �ѹ������Դϴ�.
100�� �Ա���
���� 100�� �ֽ��ϴ�.

java Bank02 ȫ�浿 �ϳ����� 2 100
ȫ�浿���� �ְŷ������� �ϳ������Դϴ�.
100�� �����
���� -100�� �ֽ��ϴ�.
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

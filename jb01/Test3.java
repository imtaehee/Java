//package jb01.test;

/*
 �� ���� �Է¹ް� �Է¹��� ���� ¦��, Ȧ��, 3�� ����� �Ǵ��ϱ�
 FileName : Test3.java
 
 ���� ��> java Test3 10 15
 ==>������(��°��)(�˾Ƽ� ����� ��)
 �Է��Ͻ� 1��° ���ڰ� 10�� ¦���̸� 3�� ����� �ƴմϴ�.
 �Է��Ͻ� 2��° ���ڰ� 15�� Ȧ���̸� 3�� ����Դϴ�.
 */

public class Test3 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a%2==0 & a%3==1){
		    System.out.println("�Է��Ͻ� 1��° ���ڰ� " + a+ "�� ¦���̸� 3�� ����� �ƴմϴ�.");
        }else if(a%2 == 0 & a%3 ==0){
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + a+ "�� ¦���̸� 3�� ����Դϴ�.");
		}else if(a%2 == 1 & a%3 ==1){
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + a+ "�� Ȧ���̸� 3�� ����� �ƴմϴ�.");
		}else if(a%2 == 1 & a%3 ==0){
			System.out.println("�Է��Ͻ� 1��° ���ڰ� " + a+ "�� Ȧ���̸� 3�� ����Դϴ�.");
		}

		if(b%2==0 & b%3==1){
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + b+ "�� ¦���̸� 3�� ����� �ƴմϴ�.");
        }else if(b%2 == 0 & b%3 ==0){
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + b+ "�� ¦���̸� 3�� ����Դϴ�.");
		else if(b%2 == 1 & b%3 ==1){
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + b+ "�� Ȧ���̸� 3�� ����� �ƴմϴ�.");
		}else if(b%2 == 1 & b%3 ==0){
			System.out.println("�Է��Ͻ� 2��° ���ڰ� " + b+ "�� Ȧ���̸� 3�� ����Դϴ�.");
		}



    }
}

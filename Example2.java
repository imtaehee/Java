//package jb02.part02;

/*
 1��~9���� �Է¹޾� �Է¹��� �ܼ��� ����ϴ� ���α׷�
 �Է°��� 0���ϰų� 10�̻��� ��� 1~9������ ���� �Է��� ���� ����Ұ�.
 
 ���࿹> java Example2 5
 ==> ������(��°��)
 5���� ����մϴ�.
 1*5 = 5
 2*5 = 10
 ....
 */

import java.util.Scanner;

public class JavaExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int i = 1;
		System.out.println(a + "���� ����մϴ�.");
		while(i<10) {
			System.out.println(i + "*" + a + "=" + i*a);
			i++;
		}
	}

}

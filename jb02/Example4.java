//package jb02.part02;

/*
 for���� �̿��Ͽ� 1��~9���� ����ϴ� ���α׷�
 
 ���� ��> java Example4
 ==>java ������(��°��)
 1���� ����մϴ�.
 1*1 = 1
 2*1 = 2
 ...
 9���� ����մϴ�.
 1*9 = 9
 2*9 = 18
 ...
 */

public class Example4 {
	public static void main(String args[]) {
		for(int i =1; i<10; i++) {
			System.out.println( i + "���� ����մϴ�.");
			for(int k = 1; k<10; k++) {
				System.out.println(i + "*" + k +" =" + i*k);
			}
		}
	}

}

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

public class Example2 {
	public static void main(String args[]) {
		
		int a = Integer.parseInt(args[0]);

		if (a>0 && a<10)	{
		    int i = 1;
		    System.out.println(a + "���� ����մϴ�.");
		    while(i<10) {
		    	System.out.println(i + "*" + a + "=" + i*a);
		    	i++;
		    }
		}else{
			System.out.println("1\n2\n3\n4\n5\n6\n7\n8\n9");
		}
	}

}

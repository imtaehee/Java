//package a.base.ex01;

/*
1���� ũ�� 10���� ���� ������ �Է¹޾Ƽ� �Ʒ��� ���� 
�������� ��Ÿ������ Ŭ������ ���θ޼��� �ϼ��Ͻÿ�

�Է¹��� ���ڿ� �ش��ϴ� �������� �ϼ���Ű�� ���α׷�
2���� �۰ų� 9���� ū ������ �Էµ� ��쿡�� "�߸��� ���ڰ� �ԷµǾ����ϴ�." 
��� ���޽����� ����ϰ� ���α׷� ����

1���� ũ�� 10���� ���� ������ �Է��ϼ���. : 3
3*1 = 3
3*2 = 6
3*3 = 9
....
3*9 = 27
*/

import java.util.Scanner;

public class  ProbAEx01{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���.");
		int inputInt = keyboard.nextInt();

		if(inputInt<2 || inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}

		for(int i=1; i<10; i++){
			System.out.println(inputInt+ "*" +i+ "=" + inputInt*i);
		}
	}
}

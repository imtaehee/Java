//package a.base.ex04;

/*
������ ������ �Է¹޾Ƽ� 1���� 1000������ �� �߿���
�Է¹��� ������ ����� ������ ������� �� ����Ͻÿ�

[��°�]
���� ������ �Է��ϼ��� : 7
7�� ��� ���� = 142
7�� ��� �� = 71071
*/

import java.util.Scanner;

public class ProbEx04 {
	public static void main(String[]args){
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���: ");
		number = keyboard.nextInt();

		for(int i = 1; i<=1000; i++){
			if((i%number) ==0){
				sum += i;
				count++;
			}
		}
		
		System.out.println(number+ "�� ��� ����= " +count);
		System.out.println(number+ "�� ��� ��= " +sum);


	}
}

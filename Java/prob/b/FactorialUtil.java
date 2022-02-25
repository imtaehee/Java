//package b.method.ex06

/*
FactorialUtil class�� int factorial(int n) �޼ҵ� �ϼ��ϱ�
Factorial �޼ҵ�� �Է°��� ���� ���(n)�� ���丮���� ����
���丮�� ������� 1���� �ش簪 ���ڱ����� ��� ���ڸ�  ���� ��
�ݵ�� ������� ���(Recursion) �̿��Ͽ� ����

5 �Է�
���丮�� ��� �� = 120 (5*4*3*2*1)
*/


import java.util.Scanner;

public class FactorialUtil{

	public int factorial(int n){

		int mult=1;

		if(n<0){
			System.out.print("0���� ū ���ڸ� �Է��ϼ���.");
			System.exit(0);
	    }


		for(int k=1; k<=n; k++){
			mult *= k;
		}
		return mult;
		
        /*
		if(n!=1){
			mult = n*factorial(n-1);
		}else {
			return 1;
		}
		return mult;
		*/
    }

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("input = ");

		FactorialUtil util = new FactorialUtil();	
		System.out.print("Result= " +util.factorial(keyboard.nextInt()));

	}
}

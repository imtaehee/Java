//package a.base.ex09;

/*
�ϳ��� ��ǥ�� ����ϴ� ����� �ϳ��� ���鹮�� �Ǵ�
���๮�ڸ� ����ϴ� ������ ���. �ݵ�� �ݺ��� ���
���̾Ƹ��� ����� ���ڴ� ����ÿ� ���θ޼�����
����� �Ű�����(program argument)�� ����

3�Է�
   *
  ***
 *****

 */


public class ProbEx09{
	public static void main(String[] args){

		int number = Integer.parseInt(args[0]);

		if(args.length !=1){
			System.out.print("�ϳ��� ���ڸ� �Է��ϼ���.");
			System.exit(0);
		}

		if(number<0 || number%2 ==0){
			System.out.print("0���� ū Ȧ���� �Է��ϼ���.");
			System.exit(0);
		}

		for(int i=1; i<=number; i++){
			for(int k=number-i; k>0; k--){
				System.out.print(" ");
			}
			for(int m=1; m<i*2; m++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}

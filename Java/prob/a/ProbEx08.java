//package a.base.ex08

/*
���α׷� ����� ����� �Ű�����(command line argument)��
�Է¹��� ���ڸ� �̿��Ͽ� �ش� ���ڸ� �������� 
���ﰢ�� ����� '*' �� �ܼ�â�� ���

5�Է�
*****
 ***
  *

*/

public class ProbEx08{
	public static void main(String[] args){

		int number=Integer.parseInt(args[0]);

		if(args.length !=1){
			System.out.println("���ڸ� �ϳ� �Է��ϼ���.");
			return;
		}

		if(number<=0 || number%2==0){
			System.out.print("0���� ū Ȧ���� �Է� �����մϴ�.");
			System.exit(0);
		}

		
	    for(int i=(number/2)+1; i>0; i--){ //����
			
		 for(int k=0; k<(number/2)+1-i; k++){ //����
			   System.out.print(" ");
		 }
		 for(int m=i*2-1; m>0; m--){ //*
			System.out.print("*");
		 }

		 System.out.print("\n");
		
		}
	
	}
}

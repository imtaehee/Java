//package b.method.ex01;

/*
�ΰ��� ���ڸ� �Ű������� �޾Ƽ� �� ���� ������ ����
���ϵ�, ���� ����� ������ ��� ���� ������ �����Ͽ� ����
�ϴ� abs() �޼��� ����
��, �־��� �޼���ñ״��� ���������ʱ�
*/

public class ProbEx01{
	
	
	public int abs(int num1,int num2){
		
		if(num1>num2){
			return num1-num2;
		}else if(num1<num2){
			return (-(num1-num2));
		}
			
		return 0;
	}	
	
	
	public static void main(String[] args){
		int num1=6;
		int num2=15;

		ProbEx01 prob =new ProbEx01();
		System.out.println("�� ���� ����: " + prob.abs(num1,num2));
	}
}

//package b.method.ex12

//1~9�������� üũ�ؾ���

public class ProbEx12{

	public static void printGugudan(int no) {

		if (no<1 || no>9){
			System.out.println("1 �̻� 9 ������ ���� �Է��ϼž� �մϴ�.");
			return;
		}
		
		for(int k=1; k<10; k++){
			for (int i=1; i<=no ;i++){

				System.out.print(i+"*"+k+"="+k*i+"\t");
			}

			System.out.print("\n");
		}
	}

	public static void main(String[] args){
		System.out.println("�־��� ���ڱ����� �������� ����ϴ�.");
		System.out.println("----------Sample1------------------");
		printGugudan(4);

		System.out.println("----------Sample2------------------");
		printGugudan(9);

		System.out.println("----------Sample3------------------");
		printGugudan(-1);

		System.out.println("----------Sample1------------------");
		printGugudan(10);
	}
}

//package b.method.ex15;

/*
main�� ������ �迭�� �Ű������� �޾Ƽ� �迭�� ������
Ȧ��, ¦������ �����Ͽ� Ȧ���� �հ� ¦���� ���� ����ϴ�
calc() �޼��� ����
*/

public class ProbEx15{

	public void calc(int[] ix){

		int sum1=0;
		int sum2=0;

		for(int i=0; i<ix.length; i++){
			if(ix[i]%2!=0){
				sum1+=ix[i];
			}else if(ix[i]%2==0){
				sum2+=ix[i];
			}
		}
		System.out.println("Ȧ���� ��: " + sum1);
		System.out.println("¦���� ��: " + sum2);

	}

	public static void main(String[] args){

		int[] ia=new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib=new int[]{1,2,3,4,5};

		ProbEx15 p=new ProbEx15();
		System.out.println("(�迭 ia)");
		p.calc(ia);
		System.out.println("(�迭 ib)");
		p.calc(ib);
	}
}

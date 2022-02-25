//package b.method.ex15;

/*
main의 정수형 배열을 매개변수로 받아서 배열의 내용을
홀수, 짝수인지 구분하여 홀수의 합과 짝수의 합을 출력하는
calc() 메서드 구현
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
		System.out.println("홀수의 합: " + sum1);
		System.out.println("짝수의 합: " + sum2);

	}

	public static void main(String[] args){

		int[] ia=new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib=new int[]{1,2,3,4,5};

		ProbEx15 p=new ProbEx15();
		System.out.println("(배열 ia)");
		p.calc(ia);
		System.out.println("(배열 ib)");
		p.calc(ib);
	}
}

//package b.method.ex12

//1~9숫자인지 체크해야함

public class ProbEx12{

	public static void printGugudan(int no) {

		if (no<1 || no>9){
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");
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
		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
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

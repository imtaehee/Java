//package a.base.ex09;

/*
하나의 별표를 출력하는 문장과 하나의 공백문자 또는
개행문자를 출력하는 문장을 사용. 반드시 반복문 사용
다이아몬드로 출력할 숫자는 실행시에 메인메서드의
명령형 매개변수(program argument)로 받음

3입력
   *
  ***
 *****

 */


public class ProbEx09{
	public static void main(String[] args){

		int number = Integer.parseInt(args[0]);

		if(args.length !=1){
			System.out.print("하나의 숫자를 입력하세요.");
			System.exit(0);
		}

		if(number<0 || number%2 ==0){
			System.out.print("0보다 큰 홀수를 입력하세요.");
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

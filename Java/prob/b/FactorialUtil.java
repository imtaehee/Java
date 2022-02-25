//package b.method.ex06

/*
FactorialUtil class의 int factorial(int n) 메소드 완성하기
Factorial 메소드는 입력값에 따른 양수(n)의 팩토리얼을 리턴
팩토리얼 결과값은 1부터 해당값 숫자까지의 모든 숫자를  곱한 값
반드시 재귀적인 방법(Recursion) 이용하여 구현

5 입력
팩토리얼 결과 값 = 120 (5*4*3*2*1)
*/


import java.util.Scanner;

public class FactorialUtil{

	public int factorial(int n){

		int mult=1;

		if(n<0){
			System.out.print("0보다 큰 숫자를 입력하세요.");
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

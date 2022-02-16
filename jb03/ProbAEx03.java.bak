/*
임의의 숫자를 입력받아 아래와 같은 실행결과가 나타나는 프로그램을 작성하시오.
단 2보다 작거나 9보다 큰 정수가 입력될 경우에는 "잘못된 숫자가 입력되었습니다." 
라는 결과 메시지를 출력하고 프로그램 종료

1보다 크고 10보다 작은 정수를 입력하세요. : 5
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
*/


import java.util.Scanner;

public class  ProbAEx03{

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");

		int inputInt = keyboard.nextInt();

		if(inputInt<2 || inputInt>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}

		int mult = 1;

		for(int i=1; i<=inputInt; i++){
		    mult = mult*i;
			System.out.println(i+ "! = " +mult);
		}

	}
}

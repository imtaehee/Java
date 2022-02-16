//package a.base.ex01;

/*
1보다 크고 10보다 작은 정수를 입력받아서 아래와 같은 
실행결과가 나타나도록 클래스의 메인메서드 완성하시오

입력받은 숫자에 해당하는 구구단을 완성시키는 프로그램
2보다 작거나 9보다 큰 정수가 입력될 경우에는 "잘못된 숫자가 입력되었습니다." 
라는 경고메시지를 출력하고 프로그램 종료

1보다 크고 10보다 작은 정수를 입력하세요. : 3
3*1 = 3
3*2 = 6
3*3 = 9
....
3*9 = 27
*/

import java.util.Scanner;

public class  ProbAEx01{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.");
		int inputInt = keyboard.nextInt();

		if(inputInt<2 || inputInt>9){
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}

		for(int i=1; i<10; i++){
			System.out.println(inputInt+ "*" +i+ "=" + inputInt*i);
		}
	}
}

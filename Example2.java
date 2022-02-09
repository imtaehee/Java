//package jb02.part02;

/*
 1단~9단을 입력받아 입력받은 단수를 출력하는 프로그램
 입력값이 0이하거나 10이상인 경우 1~9까지의 값을 입력할 것을 출렵할것.
 
 실행예> java Example2 5
 ==> 실행결과(출력결과)
 5단을 출력합니다.
 1*5 = 5
 2*5 = 10
 ....
 */

import java.util.Scanner;

public class JavaExample2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		int i = 1;
		System.out.println(a + "단을 출력합니다.");
		while(i<10) {
			System.out.println(i + "*" + a + "=" + i*a);
			i++;
		}
	}

}

//package a.base.ex04;

/*
임의의 정수를 입력받아서 1부터 1000까지의 수 중에서
입력받은 정수의 배수의 개수와 배수들의 합 계산하시오

[출력값]
양의 정수를 입력하세요 : 7
7의 배수 개수 = 142
7의 배수 합 = 71071
*/

import java.util.Scanner;

public class ProbEx04 {
	public static void main(String[]args){
		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요: ");
		number = keyboard.nextInt();

		for(int i = 1; i<=1000; i++){
			if((i%number) ==0){
				sum += i;
				count++;
			}
		}
		
		System.out.println(number+ "의 배수 개수= " +count);
		System.out.println(number+ "의 배수 합= " +sum);


	}
}

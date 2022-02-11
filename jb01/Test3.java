//package jb01.test;

/*
 두 수를 입력받고 입력받은 수가 짝수, 홀수, 3의 배수를 판단하기
 FileName : Test3.java
 
 실행 예> java Test3 10 15
 ==>실행결과(출력결과)(알아서 출력할 것)
 입력하신 1번째 인자값 10은 짝수이며 3의 배수가 아닙니다.
 입력하신 2번째 인자값 15은 홀수이며 3의 배수입니다.
 */

public class Test3 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(a%2==0 & a%3==1){
		    System.out.println("입력하신 1번째 인자값 " + a+ "은 짝수이며 3의 배수가 아닙니다.");
        }else if(a%2 == 0 & a%3 ==0){
			System.out.println("입력하신 1번째 인자값 " + a+ "은 짝수이며 3의 배수입니다.");
		}else if(a%2 == 1 & a%3 ==1){
			System.out.println("입력하신 1번째 인자값 " + a+ "은 홀수이며 3의 배수가 아닙니다.");
		}else if(a%2 == 1 & a%3 ==0){
			System.out.println("입력하신 1번째 인자값 " + a+ "은 홀수이며 3의 배수입니다.");
		}

		if(b%2==0 & b%3==1){
			System.out.println("입력하신 2번째 인자값 " + b+ "은 짝수이며 3의 배수가 아닙니다.");
        }else if(b%2 == 0 & b%3 ==0){
			System.out.println("입력하신 2번째 인자값 " + b+ "은 짝수이며 3의 배수입니다.");
		else if(b%2 == 1 & b%3 ==1){
			System.out.println("입력하신 2번째 인자값 " + b+ "은 홀수이며 3의 배수가 아닙니다.");
		}else if(b%2 == 1 & b%3 ==0){
			System.out.println("입력하신 2번째 인자값 " + b+ "은 홀수이며 3의 배수입니다.");
		}



    }
}

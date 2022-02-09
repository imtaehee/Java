//package jb02.part02;

/*
 두 수를 입력받고 두 사이의 값의 합을 구하기
 실행 예> java Example3 1 10
 ==> 실행결과(출력결과)
 1~10의 합은 55입니다.
 
 <<java Example3 10 1 인 경우도 위와 같이 출력>>
 <<java Example3 10 10 으로 입력될 경우>>
 입력값이 같습니다 [usage]:: 어쩌구저쩌구
 */

public class JavaExample3 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num1= Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
	
		if(num1 == num2) {
			System.out.println("입력값이 같습니다");
		}else if(num1<num2) {
			for(int i= num1; i<=num2; i++) {
			sum += i;
		}	System.out.println(num1 + "~" + num2 + "의 합은" + sum + "입니다.");
		} else {
			for(int i=num2; i<=num1; i++) {
			sum += i;
		}	System.out.println(num1 + "~" + num2 + "의 합은" + sum + "입니다.");
		}
	}

}

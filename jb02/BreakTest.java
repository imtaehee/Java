//package jb02.part03;

/*
 keyword break ==> 자신이 속한 반복문은 종료
 break문을 이용하여 입력받은 수까지의 합을 구하자
 java BreakTest 10 ==> 1~10 더해서 55출력
 */
public class BreakTest {
	public static void main(String[] args) {
		//입력받은 data를 int변환
		int inputData = Integer.parseInt(args[0]);
		
		//while문의 초기화변수 선언
		int i = 0;
		
		//더한 값을 저장하기 위한 변수선언
		int sum = 0;
		
		while(true) {
			i++;
			sum += i;
			
			if(i==inputData) {
				break;
			}
		}
		System.out.println("1~" + inputData + "까지의 합은: " + sum + "입니다.");
	}

}

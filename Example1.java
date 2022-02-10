//package jb01.test;
/*
 숫자를 입력받아(1~100) 90이상 수, 80점이상 우, 70점이상 미, 60점이상 양
 그 이하는 가를 출력하기
 (입력한 값이 0~100상이 이어야 한다. 그이상 그이하일 경우 어떻게 처리할 것인가)
 FileName : Example1.java

실행 예> java Example1 95
==>실행결과(출력결과)
입력하신 값 95점은 수입니다.
*/

public class Example1 {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);

		//if (num<=100 & num>=90){
		//	System.out.println("수");
		//}else if (num<90 & num>=80){
		//	System.out.println("우");
		//}else if (num<80 & num>=70){
		//	System.out.println("미");
		//}else if (num<70 & num>=60){
		//	System.out.println("양");
		//}else if (num<60 & num>=0){
		//	System.out.println("가");
		
		while(num<=100 && num>=0){

		switch ((int)num/10){
			case 10:
			case 9:
				System.out.println("수");
			    break;
			case 8:
				System.out.println("우");
				break;
			case 7:
				System.out.println("미");
			    break;
			case 6:
				System.out.println("양");
			    break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("가");
			    break;
		}
		System.out.println("잘못 입력했습니다. 0~100 사이의 점수를 입력하세요.");
		break;
		}
	}
}

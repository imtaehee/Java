//package b.method.ex01;

/*
두개의 숫자를 매개변수로 받아서 두 숫자 사이의 차를
구하되, 실행 결과가 음수일 경우 양의 정수로 변경하여 리턴
하는 abs() 메서드 구현
단, 주어진 메서드시그니쳐 변경하지않기
*/

public class ProbEx01{
	
	
	public int abs(int num1,int num2){
		
		if(num1>num2){
			return num1-num2;
		}else if(num1<num2){
			return (-(num1-num2));
		}
			
		return 0;
	}	
	
	
	public static void main(String[] args){
		int num1=6;
		int num2=15;

		ProbEx01 prob =new ProbEx01();
		System.out.println("두 수의 차는: " + prob.abs(num1,num2));
	}
}

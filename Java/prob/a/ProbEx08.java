//package a.base.ex08

/*
프로그램 실행시 명령형 매개변수(command line argument)로
입력받은 숫자를 이용하여 해당 숫자를 기준으로 
역삼각형 모양의 '*' 을 콘솔창에 출력

5입력
*****
 ***
  *

*/

public class ProbEx08{
	public static void main(String[] args){

		int number=Integer.parseInt(args[0]);

		if(args.length !=1){
			System.out.println("숫자를 하나 입력하세요.");
			return;
		}

		if(number<=0 || number%2==0){
			System.out.print("0보다 큰 홀수만 입력 가능합니다.");
			System.exit(0);
		}

		
	    for(int i=(number/2)+1; i>0; i--){ //엔터
			
		 for(int k=0; k<(number/2)+1-i; k++){ //공백
			   System.out.print(" ");
		 }
		 for(int m=i*2-1; m>0; m--){ //*
			System.out.print("*");
		 }

		 System.out.print("\n");
		
		}
	
	}
}

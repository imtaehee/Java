//package b.method.ex04;

/*
자신이 태어난 달을 명령행 매개변수로 받아서 어떤 계절에
태어났는지를 출력하는 printSeason() 메서드 구현
(단, 반드시 switch문을 사용해야하며 1~12월이 아닌 달을
입력했을 경우 "1~12 사이의 숫자만 입력하셔야 합니다."
라는 문자를 출력하도록 해야한다. 그리고 주어진 메서드의
시그니쳐는 변경하지 않는다.)
봄:3,4,5월 / 여름:6,7,8월 / 가을:9,10,11월 / 겨울: 12,1,2월

명령행 매개변수 8
여름에 태어나셨네요
*/

public class ProbEx04{

	public void printSeason(int month){

		String season = "겨울";
		
		if(month>0 && month<13){

		    switch(month){
		    	case 3:
			    case 4:
			    case 5:
			    	season = "봄";
			    break;
			    case 6:
			    case 7:
			    case 8:
			    	season = "여름";
			    break;
			    case 9:
			    case 10:
			    case 11:
			    	season = "가을";
			    default:
	    	}

			System.out.print(season+ "에 태어나셨네요");

			 
		}else {
			System.out.print("1~12 사이의 숫자만 입력하셔야 합니다.");
			return;
		}


	
	}

	public static void main(String[] args){
		int month=Integer.parseInt(args[0]);
		new ProbEx04().printSeason(month);
	}
}

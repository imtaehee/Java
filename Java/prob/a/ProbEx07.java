//package a.base.ex07;

public class ProbEx07 {
	public static void main(String[] args) {
		
		int year = 2010;
		int month = 2;
		int maxDay = 0;

		if (month ==8 || month%2 ==1) {
		    maxDay = 31;
	    }else if(month%2 == 0 && month != 2) {
	    	maxDay = 30;
	    }
		
		//2월이 문제,,,
		/*
		if(month ==2) {
			if(year%4 ==0) {
				if (year%400 ==0) {
					maxDay = 29;
				}else if (year%100 ==0) {
					maxDay = 28;
				}else {
					maxDay = 29;
				}
			}else {
				maxDay = 28;
			}
		}
		*/
		
		if(month ==2) {
			if (year%4 ==0 && year%100 !=0 || year%400 ==0) {
				maxDay = 29;
			}else {
				maxDay = 28;
			}
		}
		
		
		System.out.println(year+ "년 " + month+ "월의 말일은 " +maxDay+ "일 입니다.");
	}

}

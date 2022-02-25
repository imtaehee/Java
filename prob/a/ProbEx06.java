//package a.base.ex06;

/*
주어진 일차원 배열의 내용을 오름차순으로 정렬하는 프로그램을 작성
단 main() 메서드에 작성하고 반드시 이중 for문을 사용하여 구현
*/

import java.util.Arrays;

public class ProbEx06{
	public static void main(String[] args){
		
		int[] array = {3, 24, 1, 55, 17, 43, 5};

		for(int i= 0; i<array.length; i++){
			for(int k=i+1; k<array.length; k++){
				if(array[i]>array[k]){
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}

		for(int i=0; i<array.length; i++){

			System.out.print(array[i]);

		    if(i != (array.length-1)){
                System.out.print(", ");
		    }else{
		    	System.out.print("");
		    }
		}
		

		//System.out.println(Arrays.toString(array));


		/* sorting algorithm
		Arrays.sort(array);
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+", ");
		}
		*/
		
	}
}

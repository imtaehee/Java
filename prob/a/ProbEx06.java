//package a.base.ex06;

/*
�־��� ������ �迭�� ������ ������������ �����ϴ� ���α׷��� �ۼ�
�� main() �޼��忡 �ۼ��ϰ� �ݵ�� ���� for���� ����Ͽ� ����
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

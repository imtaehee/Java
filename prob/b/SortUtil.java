//package b.method.ex05;

/*
SorUtil Ŭ������ int[] ascending(int[] inputNumbers) �޼ҵ�ϼ�
ascending �޼ҵ�� �Էµ� ���ڵ��� ������������ �����Ͽ� ����
���� �迭 ���� ������ ���ڴ� �������� �ʴ°����� ����
*/

public class SortUtil{
	public  int[] ascending(int[] inputNumbers){

		for(int i=0; i<inputNumbers.length; i++){
			for (int k=i+1;k<inputNumbers.length; k++ ){
				
				if(inputNumbers[i]>inputNumbers[k]){
					int temp =inputNumbers[i];
					inputNumbers[i]=inputNumbers[k];
					inputNumbers[k]=temp;

				}
			}
		}
		return inputNumbers;
	}


	public static void main(String[] args){

		SortUtil util = new SortUtil();
		int[] numbers = new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

		numbers = util.ascending(numbers);

		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);

			if(i != numbers.length-1){
				System.out.print(", ");
			}else {
				System.out.print("");
			}
		}
	}
}

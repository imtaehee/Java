//package b.method.ex05;

/*
SorUtil 클래스의 int[] ascending(int[] inputNumbers) 메소드완성
ascending 메소드는 입력된 숫자들을 오름차순으로 정렬하여 리턴
숫자 배열 내에 동일한 숫자는 존재하지 않는것으로 간주
*/

public class SortUtil{
	public  int[] ascending(int[] inputNumbers){
		//구현
		return null;
	}

	publlic static void main(String[] args){

		SortUtil util = new SortUtil();
		int[] numbers = new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

		numbers = util.ascending(numbers);

		for(int i=0; i?<numbers.length; i++){
			System.out.print(numbers[i]);

			if(i != numbers.length-1){
				System.out.print(", ");
			}else {
				System.out.print("");
			}
		}
	}
}

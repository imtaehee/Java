/*
�������� 50������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

public class ProbAEx02{

	public static void main(String[] args) {
		
		int limit = 50;
		boolean prime = false;
		
			
		for(int k=2; k<limit; k++){
			prime = true;
			
			for(int j=2; j<k; j++){
				if(k%j ==0){
					prime = false;
					break;
				}
		    }
		
		if (prime){
			 System.out.println(k +"\n");
		}
		
		}

	}
}

//package b.method.ex13

class Util{
	
	//���ڷ� ���� limit������ �Ҽ��� ������ return�ϴ� method
	public int findPrimeCount(int limit){
		/*
		int count=0;
		int primeCount=0;

		for(int i=2; i<=limit; i++){			
			for(int k=2; k<=i; k++){
				
				if(i % k ==0){
				    count++;
				}
			}
			if(count==1){
				primeCount++;
			}
			count=0;
		}
		return primeCount;
		*/
		int count=0;
		
		for(int i=2; i<=limit; i++){			
			for(int k=2; k<=i; k++){
				
				if(i % k ==0 && i!=k){
					break;
				}
				if(i % k ==0 && i==k){
					count++;
				}
			}
		}
		return count;
	}

	//���ڷ� ���� limit������ �Ҽ����� �迭ũ�⸦ ���� int�迭�� ��� return�ϴ� method
    public int[] findPrimeReturnArray(int limit){

	    int[] arr=new int[findPrimeCount(limit)];
	    int arrayCount=0;
	    
	    for(int i=2; i<=limit; i++){			
			for(int k=2; k<=i; k++){
				
				if(i % k ==0 && i!=k){
					break;
				}
				if(i % k ==0 && i==k){
					arr[arrayCount]=i;
					arrayCount++;
				}
			}
		}
		return arr;
    }
}

public class ProbEx13{
	public static void main(String[] args){

		int limit=67;

		Util util=new Util();

		int primeCount=util.findPrimeCount(limit);
		System.out.println("1~"+limit+"������ �Ҽ��� ������"+primeCount+"EA�̸� �Ҽ��� �Ʒ��� ����.");

		System.out.println("///////////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+ ((primeArray.length-1)!=i? ",": " "));
		}
	}
}
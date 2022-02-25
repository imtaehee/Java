//package b.method.ex13

class Util{
	
	//인자로 받은 limit까지의 소수의 갯수를 return하는 method
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

	//인자로 받은 limit까지의 소수갯수 배열크기를 갖는 int배열에 담아 return하는 method
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
		System.out.println("1~"+limit+"까지의 소수의 개수는"+primeCount+"EA이며 소수는 아래와 같다.");

		System.out.println("///////////////////////////////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length; i++){
			System.out.print(primeArray[i]+ ((primeArray.length-1)!=i? ",": " "));
		}
	}
}

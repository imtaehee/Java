//package jb

final class TopSecret04{

	//access modifier를 활용한 information hiding
	//final modifier를 활용한 수정불가
	private final int secretNo=7777;


	//Ace=cess modifier을 통한 객체생성불가
	//private Constructor을 사용한 이유 이해
	private TopSecret03(){
	}

	//method를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd){
		if(pwd==0){
		return secretNo;
		}else{
			return 0;
		}
	}

	//static method를 이용한 instance return하게하여 
	//다른 class에서 사용가능하게함
	//manageNo를 인자로 받아 Instance를 return할 것인지를 판단
    public static TopSecret04 getInstance(int managerNo){
	
		
		if (managerNo ==1234){
		    return new TopSecret04();
		}else{
			return null;
		}
    }
}

public class ModifierTest04{
	public static void main(String[] args){
		
		//instance 생성 불가로 static method를 통해 인스턴스 return받는다.
		//또한 instance를 return 받는 경우도 조건(manageNo)을 충족해야함

		TopSecret04 topSecret=TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo());
	}
}

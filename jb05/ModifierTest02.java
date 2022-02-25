//package jb05.part03;

class TopSecret02{
	private int secretNo=7777;

	public TopSecret02(){
	}

	public int getSecretNo(int pwd){
		if(pwd==0){
		return secretNo;
		}else{
			return 0;
		}
	}
}

public class MdifierTest02{
	public static void main(String[] args){

		TopSecret02 topSecret=new TopSecret02();
		
		//private Field는 information hiding되어 있어 접근,변경 불가
		//Method를 통해 접근만 가능/ 변경은 불가
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo=1234;

		System.out.println(topSecret.getSecretNo());
	}
}

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
		
		//private Field�� information hiding�Ǿ� �־� ����,���� �Ұ�
		//Method�� ���� ���ٸ� ����/ ������ �Ұ�
		//System.out.println(topSecret.secretNo);
		//topSecret.secretNo=1234;

		System.out.println(topSecret.getSecretNo());
	}
}

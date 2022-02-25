//package jb05.part03;

/*
class 구현 시 Modifier/Access Modifier 어떻게 활용, 응용되는지 살펴보기
Access Modifier, Modifier로 어떻게 변경시키는지 이해
*/

class TopSecert01{

	int secretNo=7777;

	public TopSecret01(){
	}

	public int getSecretNo(){
		return secretNo;
	}
}

public class MdifierTest01{
	public static void main(String[] args){

		TopSecret01 topSecret=new TopSecret01();
		System.out.println(topSecret.secretNo);

		topSecret.secretNo =1234;
		System.out.println(topSecret.getSecretNo());
	}
}

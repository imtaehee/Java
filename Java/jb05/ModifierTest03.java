//package jb

final class TopSecret03{
	
	//access modifier�� Ȱ���� information hiding
	//final modifier�� Ȱ���� �����Ұ�
	private final int secretNo=7777;

	//Acecess modifier�� ���� ��ü�����Ұ�
	//private Constructor�� ����� ���� ����
	private TopSecret03(){
	}

	//method�� ���� ������ ������ ��츸 secretNo�� return
	public int getSecretNo(int pwd){
		if(pwd==0){
		return secretNo;
		}else{
			return 0;
		}
	}

	//static method�� �̿��� instance return�ϰ��Ͽ� 
	//�ٸ� class���� ��밡���ϰ���
    public static TopSecret03 getInstance(){
	
		TopSecret03 topSecret=new TopSecret03();
		return topSecret;
		//return new TopSecret03();
    }
}

public class ModifierTest03{
	public static void main(String[] args){
		
		//�����ڰ� private�� instance ����(������ ȣ��)�Ұ���
		//TopSecret topSecret=new TopSecret();
		//instance ������ �Ұ��� static method�� ���� ��ü�� return�޴´�.

		TopSecret03 topSecret=new TopSecret03();
		System.out.println(topSecret.getSecretNo());
	}
}

//package jb

final class TopSecret04{

	//access modifier�� Ȱ���� information hiding
	//final modifier�� Ȱ���� �����Ұ�
	private final int secretNo=7777;


	//Ace=cess modifier�� ���� ��ü�����Ұ�
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
	//manageNo�� ���ڷ� �޾� Instance�� return�� �������� �Ǵ�
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
		
		//instance ���� �Ұ��� static method�� ���� �ν��Ͻ� return�޴´�.
		//���� instance�� return �޴� ��쵵 ����(manageNo)�� �����ؾ���

		TopSecret04 topSecret=TopSecret04.getInstance(1234);
		System.out.println(topSecret.getSecretNo());
	}
}

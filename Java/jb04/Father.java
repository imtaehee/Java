package jb04.part07;

/*
 * Encapsulation(information hiding)�� �����ϴ� Access Modifier ����
 * public/protected/(  )/private�� ��� �� ����
 */

public class Father {
	public String name="ȫ�浿";        //public:������ ���ٰ���
	protected String bank="�Ѿ�����";   //protected:��Ӱ���, ���� package ���ٰ���
	String branch="���ﵿ����";          //(  ):���� package ���ٰ���
	private int password=1234;        //private:�ڽŸ� ���ٰ���
	
	public Father() {
	}
	
	//������ Field�Ʒ��� Method�� ���� ������ ����
	//�Ʒ��� ������ getter Method �� �ǹ̸� ����
	
	public String getBank(int pwd) {
		if(pwd!=7777) {
			return "key���� ��Ȯ�� �Է��ϼ���";
		}else {
			return this.bank;
		}
	}
	
	public int getPassword(int key) {
		if(key!=7777) {
			return 0;
		}else {
			return this.password;
		}
	}
	
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}

}

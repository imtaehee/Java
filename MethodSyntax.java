package jb03.part04;

/*
1.OOP : Message
2.OOPL: Method
��ü���� ������ �����ϴ� Method ����
OOP���� Message(Method)�� ��ü�� data�� ���� �Ǵ� ���� �� �ִ¼���
OOP�� ��ü�� Message �������� �ʿ��� �����͸� �ѱ�ų� ��� �����͸� ���� �� �ִ�.
OOP�� ��ü�� ��ü�� ����� method ȣ��
*/

public class MethodSyntax{
	///Field
	String name = "ȫ�浿";
	String add = "�Ѿ�";

	///Method ==> �������� �Ѵ� ��������
	public void browerOn(){
		System.out.println("bower�� �Ѵ�");
	}
	
	//==>�۾��� �ϰ� �۾������� boolean type���� return�ϴ� ����
	public boolean documentWork(){
		System.out.println("document�� �۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}

	//�ΰ��� ������ �޾� ���� return�ϴ� ����
	public int sun(int i, int j){
		System.out.println("<<" +i+ ">> �� <<" +j+ ">>���� �޾� �� return");
		return(i+j);
	}

	//==> �̸��� return�ϴ� ����
	public String getName(){
		System.out.println("�̸��� �����մϴ�.");
		return name;
	}

	//�ּҸ� return�ϴ� ����
	public String getAdd(){
		System.out.println("�ּҸ� �����մϴ�.");
		return add;
	}

	//==>�̸�,�ּ� �ΰ��� ����(���°�)�� Array DataType return �ϴ� ����
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str = {"ȫ�浿", "�Ѿ�"};
		return str;
	}

}
//package jb03.part04;

/*
Bean(POJO)�� MethodSyntax.class �� ����ϴ� Application class
*/

public class MethodSyntaxApp{
	public static void main(String[] args){
		//MethodSyntax.class�� ��� (Instance ���� :: new ������ ���)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax �ĺ����� ���� Instance�� method�� .�����ڷ� ���ٻ��
		System.out.println("\n====================================");
		methodSyntax.browerOn();

		System.out.println("\n====================================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc�۾�����:" + result);

		System.out.println("\n====================================");
		int value = methodSyntax.sum(1,1);
		System.out.println("��� �����:" + value);
		//==> ���� �ζ����� �Ʒ��� ���� ǥ���ߴ�. �ּ�Ǯ�� ��°���� Ȯ���ϸ�
		//System.out.prnitln("��� �����:" + methodSyntax.sum(1,1));

		System.out.println("\n====================================");
		String name = methodSyntax.getName();
		System.out.println("Field���� name:" + name);
		//System.out.println("Field���� name:" + methodSyntax.getName(););

		System.out.println("\n====================================");
		String add = methodSyntax.getAdd();
		System.out.println("Field���� name:" + add);
		//System.out.println("Field���� name:" + methodSyntax.getAdd());

		System.out.println("\n====================================");
		String[] info = methodSyntax.getAllInformation();
		System.our.println("Field���� ��� ���");

		for(int i=0; i<info.length; i++){
		//for(int i=0l i<2; i++){      <== info.length�� ���� 2�� ��������?
			System.out.println((i+1)+ "��° ����:" +info[i]);
		}


	}
}

//package jb03.part05;

/*
�߰����� ����(Polymorphism ���� ==> Method OverLoading)
3.������ project�� name�� ǥ���� �� �ִ� �����߰�
4. ���� ���� ���� income�� ������ ������ �� �ִ� �����߰�
*/

public class Developer1{
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer;  

	public void participateProject(){
		System.out.println("���α׷����߷� ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}
	
	//========�߰� project name �� ���÷����ϴ� ����
	public void participateProject(String project){
		System.out.println(project+ "==> project������ ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}

	//========�߰����Ǽ��� ���� income ��������
	public void instruct(int lectureCount){
		System.out.println(lectureCount+ "==> ���Ǹ� ���� ��������");
		avgIncome += lectureCount
	}

}
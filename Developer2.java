//package jb03.part06;

/*
�߰����� ����
1. Field ������ return�ϴ� ������ ���� getter method ����
   (��ü�� attribute�� information hiding(Encapsulation)�Ǿ� ������
    ������ ���ؼ� information hiding�Ǿ� �ִ� ������ ������ �� �ִ�.

OOP�� information hiding �� ���������� ���信�� getter method�� �ǹ̸� Ȯ��
==> ���� information hiding �����ϴ� access Modifier �ٽ� �����ϱ�
*/

public class Developer2{
	
	String name = "ȫ�浿";
	String job = "������";
	int avgIncome = 100;
	int projectCareer;  

	public void participateProject(){
		System.out.println("���α׷����߷� ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}

	public void participateProject(String project){
		System.out.println(project+ "==> project������ ��������, ��½���");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("���Ǹ� ���� ��������");
		avgIncome++;
	}

	public void instruct(int lectureCount){
		System.out.println(lectureCount+ "==> ���Ǹ� ���� ��������");
		avgIncome += lectureCount
	}

	//=========�߰�
	/*
	���°��� return�ϴ� ���� getter method ����
	==> ��ü�� ��� ������ Encapsulation �Ǿ��ִ� ���°��� ������ �� �ִ�.
	*/
	public String getName(){
		System.out.println("getName() method");
		return name;
	}

	public String getJob(){
		System.out.println("getJob() method");
		return job;
	}

	public String getAvgIncome(){
		System.out.println("getAvgIncome() method");
		return avgIncome;
	}

	public String getProjectCareer(){
		System.out.println("getProjectCareer() method");
		return projectCareer;
	}


}
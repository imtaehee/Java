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
		avgIncome += lectureCount;
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

	public int getAvgIncome(){
		System.out.println("getAvgIncome() method");
		return avgIncome;
	}

	public int getProjectCareer(){
		System.out.println("getProjectCareer() method");
		return projectCareer;
	}


public static void main(String[] args){
		
		Developer2 developer = new Developer2();

		System.out.println("�̸�:"+developer.name);
	    System.out.println("����:"+developer.job);
	    System.out.println("��ռ�����:"+developer.avgIncome);
	    System.out.println("PJT�����:"+developer.projectCareer);

	    System.out.println("======================================");

		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸�:"+name);
	    System.out.println("����:"+job);
	    System.out.println("��ռ�����:"+avgIncome);
		//��
	    System.out.println("���������:"+developer.getProjectCareer());


	}


}

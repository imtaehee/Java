//package jb03.part03;

public class DeveloperTest{
	//Developer.class�� instanceȭ ��(keyword new ���)
	Developer deveoper = new Developer();

	//developer �ĺ����� ���� instance �����ڸ� ���� ���
	System.out.println("�̸�:"+developer.name);
	System.out.println("����:"+developer.job;
	System.out.println("��ռ�����:"+developer.avgIncome);
	System.out.println("PJT�����:"+developer.projectCareer);

	System.out.println("======================================");

	//project ����
	developer.participateProject();
	System.out.println("��ռ�����:"+developer.avgIncome);
	System.out.println("PJT�����:"+developer.projectCareer);

	System.out.println("======================================");

	//1�� ������ ����
	developer.instruct();
	System.out.println("��ռ�����:"+developer.avgIncome);

	}
}
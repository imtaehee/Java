//package jb03.part05;

public class Developer1Test{
	public static void main(String[] args){

		//Developer.class �� instance ����
		Developer1 deveopler = new Developer1();

		//devloper �ĺ����� ���� Instance .�����ڸ� ���� ���
	    System.out.println("�̸�:"+developer name);
	    System.out.println("����:"+developer job;
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

		//===========�߰�
		//ȫ�浿�� �ѹ����� project����
		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		//hong1.participateProject("�ѹ�����");
		System.out.println("��ռ�����:"+developer.avgIncome);
	    System.out.println("PJT�����:"+developer.projectCareer);

		 System.out.println("======================================");

		 //ȫ�浿�� 2�� ������ ����
		 int lectureCount=2;
		 developer.instruct(lectureCount);
		 //hong1.instruct(2);
		 System.out.println("��ռ�����:"+developer.avgIncome);
		
	}

}

//package jb03.part06;

/*
Developer2.class�� Instance ���� ����ϴ� class ���� :: Application class ����
*/

public class DevloperTest2{
	public static void main(String[] args){
		Developer2 developer = new Developer2();

		System.out.println("�̸�:"+developer.name);
	    System.out.println("����:"+developer.job;
	    System.out.println("��ռ�����:"+developer.avgIncome);
	    System.out.println("PJT�����:"+developer.projectCareer);

	    System.out.println("======================================");

		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("�̸�:"+name);
	    System.out.println("����:"+job;
	    System.out.println("��ռ�����:"+avgIncome);
	    System.out.println("PJT�����:"+projectCareer);



	}
}

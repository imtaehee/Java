//package jb03.part03;

public class DeveloperTest{
	public static void main(String[] args){
	//Developer.class를 instance화 함(keyword new 사용)
	Developer developer = new Developer();

	//developer 식별성을 갖는 instance 연산자를 통해 사용
	System.out.println("이름:"+developer.name);
	System.out.println("직업:"+developer.job);
	System.out.println("평균수입은:"+developer.avgIncome);
	System.out.println("PJT경력은:"+developer.projectCareer);

	System.out.println("======================================");

	//project 참여
	developer.participateProject();
	System.out.println("평균수입은:"+developer.avgIncome);
	System.out.println("PJT경력은:"+developer.projectCareer);

	System.out.println("======================================");

	//1개 과목을 강의
	developer.instruct();
	System.out.println("평균수입은:"+developer.avgIncome);

	}
}

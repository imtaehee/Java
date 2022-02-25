//package jb03.part05;

public class Developer1Test{
	public static void main(String[] args){

		//Developer.class 를 instance 생성
		Developer1 deveopler = new Developer1();

		//devloper 식별성을 갖는 Instance .연산자를 통해 사용
	    System.out.println("이름:"+developer name);
	    System.out.println("직업:"+developer job;
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

		//===========추가
		//홍길동이 한미은행 project참여
		String projectName = "한미은행";
		developer.participateProject(projectName);
		//hong1.participateProject("한미은행");
		System.out.println("평균수입은:"+developer.avgIncome);
	    System.out.println("PJT경력은:"+developer.projectCareer);

		 System.out.println("======================================");

		 //홍길동이 2개 과목을 강의
		 int lectureCount=2;
		 developer.instruct(lectureCount);
		 //hong1.instruct(2);
		 System.out.println("평균수입은:"+developer.avgIncome);
		
	}

}

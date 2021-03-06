//package jb03.part06;

/*
추가적인 사항
1. Field 정보를 return하는 행위를 현한 getter method 정의
   (객체의 attribute는 information hiding(Encapsulation)되어 있으며
    행위를 통해서 information hiding되어 있는 정보에 접근할 수 있다.

OOP의 information hiding 중 정보은닉의 개념에서 getter method의 의미를 확인
==> 추후 information hiding 지원하는 access Modifier 다시 정리하기
*/

public class Developer2{
	
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer;  

	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void participateProject(String project){
		System.out.println(project+ "==> project참여로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}

	public void instruct(int lectureCount){
		System.out.println(lectureCount+ "==> 강의를 통한 수입증가");
		avgIncome += lectureCount;
	}

	//=========추가
	/*
	상태값을 return하는 행위 getter method 정의
	==> 객체의 모든 정보는 Encapsulation 되어있는 상태값에 접근할 수 있다.
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

		System.out.println("이름:"+developer.name);
	    System.out.println("직업:"+developer.job);
	    System.out.println("평균수입은:"+developer.avgIncome);
	    System.out.println("PJT경력은:"+developer.projectCareer);

	    System.out.println("======================================");

		String name = developer.getName();
		String job = developer.getJob();
		int avgIncome = developer.getAvgIncome();
		System.out.println("이름:"+name);
	    System.out.println("직업:"+job);
	    System.out.println("평균수입은:"+avgIncome);
		//비교
	    System.out.println("평균입은은:"+developer.getProjectCareer());


	}


}

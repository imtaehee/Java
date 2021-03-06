//package jb03.part05;

/*
추가적인 사항(Polymorphism 지원 ==> Method OverLoading)
3.참여한 project의 name을 표기할 수 있는 행위추가
4. 강의 수에 따른 income의 정도를 명시할 수 있는 행위추가
*/

public class Developer1{
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer;  

	public void participateProject(){
		System.out.println("프로그램개발로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}
	
	//========추가 project name 을 디스플레이하는 행위
	public void participateProject(String project){
		System.out.println(project+ "==> project참여로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}

	//========추가강의수에 따라 income 증가행위
	public void instruct(int lectureCount){
		System.out.println(lectureCount+ "개 강의를 통한 수입증가");
		avgIncome += lectureCount;
	}

}

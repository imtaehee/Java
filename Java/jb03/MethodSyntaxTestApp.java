//package jb03.part04;

/*
Bean(POJO)인 MethodSyntax.class 를 사용하는 Application class
*/

public class MethodSyntaxApp{
	public static void main(String[] args){
		//MethodSyntax.class를 사용 (Instance 생성 :: new 연산자 사용)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax 식별성을 갖는 Instance의 method를 .연산자로 접근사용
		System.out.println("\n====================================");
		methodSyntax.browerOn();

		System.out.println("\n====================================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc작업유무:" + result);

		System.out.println("\n====================================");
		int value = methodSyntax.sum(1,1);
		System.out.println("계산 결과값:" + value);
		//==> 위의 두라인을 아래와 같이 표현했다. 주석풀고 출력결과를 확인하면
		//System.out.prnitln("계산 결과값:" + methodSyntax.sum(1,1));

		System.out.println("\n====================================");
		String name = methodSyntax.getName();
		System.out.println("Field정보 name:" + name);
		//System.out.println("Field정보 name:" + methodSyntax.getName(););

		System.out.println("\n====================================");
		String add = methodSyntax.getAdd();
		System.out.println("Field정보 name:" + add);
		//System.out.println("Field정보 name:" + methodSyntax.getAdd());

		System.out.println("\n====================================");
		String[] info = methodSyntax.getAllInformation();
		System.our.println("Field정보 모두 출력");

		for(int i=0; i<info.length; i++){
		//for(int i=0l i<2; i++){      <== info.length의 사용과 2의 차이점은?
			System.out.println((i+1)+ "번째 정보:" +info[i]);
		}


	}
}

//package jp02.part05;

/*
<<Inner Member Class>>
innerMember Class는 class를 구성하는 Field,method와 같이 class가 구성하는
member가 될 수 있다.
사용이유는 OuterClass와 밀접한 관련
컴파일 후 innerClass는 어떤 형태의 class가 되는지 확인
*/

public class OuterClass01{

	private String outer="OuterClass의 Field";

	public OuterClass01(){
	}

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+ "start");
		//innerClass에 접근할 경우 인스턴스 생성 후 접근
		InnerClass ic=new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+"end");
	}
	//InnerMember Class
	public class InnerClass{
		private String inner="InnerClass의 Field";

		public InnerClass(){
		}

		public void innerMethod(){
			//innerClass에서 outer class로 접근
			//Outerlass의 Field,Method에 쉽게 접근 :: 레퍼런스 불필요
			System.out.println("==>"+this.getClass().getName()+"start");

			//OuterClass의 Field 접근방식 2가지
			System.out.println(outer);
			System.out.println("==>"+this.getClass().getName()+"end");
			//아래 실행문 주석풀면 compile error
			//System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+"end");
		}
	}

	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}
}



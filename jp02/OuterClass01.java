//package jp02.part05;

/*
<<Inner Member Class>>
innerMember Class�� class�� �����ϴ� Field,method�� ���� class�� �����ϴ�
member�� �� �� �ִ�.
��������� OuterClass�� ������ ����
������ �� innerClass�� � ������ class�� �Ǵ��� Ȯ��
*/

public class OuterClass01{

	private String outer="OuterClass�� Field";

	public OuterClass01(){
	}

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+ "start");
		//innerClass�� ������ ��� �ν��Ͻ� ���� �� ����
		InnerClass ic=new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+"end");
	}
	//InnerMember Class
	public class InnerClass{
		private String inner="InnerClass�� Field";

		public InnerClass(){
		}

		public void innerMethod(){
			//innerClass���� outer class�� ����
			//Outerlass�� Field,Method�� ���� ���� :: ���۷��� ���ʿ�
			System.out.println("==>"+this.getClass().getName()+"start");

			//OuterClass�� Field ���ٹ�� 2����
			System.out.println(outer);
			System.out.println("==>"+this.getClass().getName()+"end");
			//�Ʒ� ���๮ �ּ�Ǯ�� compile error
			//System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+"end");
		}
	}

	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}
}



//package jb05.part06;

//���� class Super ����
class Super {
	
	public void a() {
		System.out.println("Super :a()");
	}
}

//���� class Super�� ��ӹ޴� ���� class Sub ����
class Sub extends Super{
	public void a() {
		System.out.println("overriding�� Sub :a()");
	}
	public void b() {
		System.out.println("sub :b()");
	}
}

public class CastingComplete{
	public static void main(String args[]) {
		
		//1. ���� class �ν��Ͻ� ����(data type==�ν��Ͻ��� ���)
		System.out.println("\n����� Super s1=new Super()�κ�");
		Super s1=new Super();
		s1.a();
		
		//2. ���� class �ν��Ͻ� ����(data type==�ν��Ͻ��� ���)
		System.out.println("\n����� Sub s2=new Sub()�κ�");
		Sub s2=new Sub();
		s2.a();
		s2.b();
		
		//3. ���� data type���� ���� �ν��Ͻ� ����(data type!=�ν��Ͻ��� ���)
		System.out.println("\n����� Super s3=new Sub()�κ�");
		Super s3=new Sub();
		s3.a();
		//�Ʒ� ������ error, s3�� b()�� ������ �� ����(�� �����ϱ�)
		//s3.b();
		//����Ϸ��� casting ������ ���(�� �ڽ��� ������ ����)
		
		System.out.println("\n s3�� b()�� ���� �Ұ��ϴ�.");
		System.out.println("casting �����ڸ� �̿� Sub sub=(Sub)s3 ����� ����ȯ");
		Sub sub=(Sub)s3;
		sub.b();
		
		//4. ���� data type���� ���� �ν��Ͻ� ����(data type!=�ν��Ͻ�)
		//error(�������۷��������� �����ν��Ͻ��� ���۷����� �� ����.
		//Sub s4=new Super();		
		
	}
}

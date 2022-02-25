//package jb05.part06;

//상위 class Super 정의
class Super {
	
	public void a() {
		System.out.println("Super :a()");
	}
}

//상위 class Super를 상속받는 하위 class Sub 정의
class Sub extends Super{
	public void a() {
		System.out.println("overriding된 Sub :a()");
	}
	public void b() {
		System.out.println("sub :b()");
	}
}

public class CastingComplete{
	public static void main(String args[]) {
		
		//1. 상위 class 인스턴스 생성(data type==인스턴스인 경우)
		System.out.println("\n여기는 Super s1=new Super()부분");
		Super s1=new Super();
		s1.a();
		
		//2. 하위 class 인스턴스 생성(data type==인스턴스인 경우)
		System.out.println("\n여기는 Sub s2=new Sub()부분");
		Sub s2=new Sub();
		s2.a();
		s2.b();
		
		//3. 상위 data type으로 하위 인스턴스 생성(data type!=인스턴스인 경우)
		System.out.println("\n여기는 Super s3=new Sub()부분");
		Super s3=new Sub();
		s3.a();
		//아래 사항은 error, s3은 b()를 참조할 수 없다(꼭 이해하기)
		//s3.b();
		//사용하려면 casting 연산자 사용(즉 자신의 원상태 복귀)
		
		System.out.println("\n s3는 b()에 접근 불가하다.");
		System.out.println("casting 연산자를 이용 Sub sub=(Sub)s3 명시적 형변환");
		Sub sub=(Sub)s3;
		sub.b();
		
		//4. 하위 data type으로 상위 인스턴스 생성(data type!=인스턴스)
		//error(하위레퍼런스변수는 상위인스턴스를 레퍼런스할 수 없다.
		//Sub s4=new Super();		
		
	}
}

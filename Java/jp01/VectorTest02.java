//package jp01.part06;

//Vector가 갖는 문자열 값을 출력하는 for문을 method로 추출
//Vector 를 확장하여 필요한 기능 method를 추가

import java.util.*;

public class VectorTest02 extends Vector{
	
	public VectorTest02() {
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement) {
		super(initialCapacity, capacityIncrement);
	}
	
	public void pringString(Vector vector) {
		//for(int i=0; i<vector.size(); i++){
		//    System.out.print((String)vector.elementAt(i));
		//}
		
		//JDK1.5에 추가된 기능 ::Enhanced For Loop
		//Vector 내부에 저장된 값을 size()만큼 반복, 1ea씩 추출 Object에 담아줌
		for(Object object:vector) {
			//위의 for문의 elementAt()후 casting한것과 비교
			System.out.print((String)object);
		}
	}
	
	public static void main(String[] args) {
		//Vector 확장하여 추가적 기능(pringString())을 정의한 VectorTest02 인스턴스
		VectorTest02 vectorTest=new VectorTest02(10,10);
		
		//Vector에 Object저장
		String s1=new String("1.홍");
		vectorTest.add(s1);
		vectorTest.add(new String("2.동"));
		vectorTest.add("3.님 안녕하세요");
		//Vector 저장된 값을 출력
		vectorTest.pringString(vectorTest);
		
		System.out.println("\n =>API확인");
		vectorTest.insertElementAt("4.길",1);
		vectorTest.pringString(vectorTest);
		
		System.out.println("\n =>API확인");
		vectorTest.setElementAt("5.홍길순",3);
		vectorTest.pringString(vectorTest);
		
		System.out.println("\n =>API확인");
		vectorTest.removeElementAt(3);
		vectorTest.pringString(vectorTest);
	}

}

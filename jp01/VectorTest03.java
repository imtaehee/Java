//package jp01.part07;;

/*
 * Generic:jdk 1.5추가기능
 * Vector생성시 관리하라 데이터타입 미리 선언가능
 * data추출 시 관리하라 데이터타입이 결정되어 있으니 명시적 형변환 불필요
 */

import java.util.*;

public class VectorTest03 {
	
	public static void main(String[] args) {
		
		//Vector 객체 생성시 관리(저장,추출)될 인스턴스 데이터타입 명시
		List <String> vector=new Vector<String>(10,10);
		
		//Vector에 String 저장
		//add(E obj): E를 인자로 받는다는 의미는? :: Generic 사용으로 묵시적 형변환 불필요
		String s1=new String("1.홍");
		vector.add(s1);
		vector.add(new String("2.동"));
		vector.add("3.님 안녕");
		
		//Vector 저장된 값 출력
		for(int i=0; i<vector.size(); i++){
		    String s =vector.elementAt(i);
		    System.out.print(s);
		    //System.out.print(vector.elementAt(i));
		}
		
		System.out.print("\nJDK1.5에 추가된 기능 ::Generic, Enhanced For Loop");
		//Vector 내부에 저장된 값을 size()만큼 반복, 1ea씩 추출 String줌
		for(String value:vector) {
		    System.out.print(value);
		}
		
		System.out.println("\n =>API확인");
		vector.insertElementAt("4.길",1);
		//vector.set(1, "4.길");
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n =>API확인");
		vector.setElementAt("5.홍길순",3);
		//vector.set(3,"5.홍길순");
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n =>API확인");
		vector.removeElementAt(3);
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
	}

}

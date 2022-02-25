//package jp01.part07;

/* Generic(jdk 1.5 추가기능)
 * ArrayList 생성 시 관리할 데이터타입을 미리 선언가능
 * 데이터 추출 시 관리할 데이터타입이 결정되어 있으니 명시적 형변환 불필요
 */

import java.util.*;

public class ArrayListTest03 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>(10);
		
		String s1=new String("1.홍");
		arrayList.add(s1);
		arrayList.add(new String("2.동"));
		arrayList.add("3.님 안녕하세요");
		
		for(int i=0; i<arrayList.size(); i++){
			//Generic 사용으로 명시적 형변환 불필요
		    System.out.print(arrayList.get(i));
		}
		
		System.out.print("\nJDK1.5에 추가된 기능 ::Generic, Enhanced For Loop");
		//Vector 내부에 저장된 값을 size()만큼 반복, 1ea씩 추출 String줌
		for(String value:arrayList) {
		    System.out.print(value);
		}
		
		System.out.println("\n =>API확인");
		arrayList.add(1,"4.길");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n =>API확인");
		arrayList.set(1,"4.길");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n =>API확인");
		arrayList.remove(3);
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

	}

}

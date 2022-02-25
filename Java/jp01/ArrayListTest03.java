//package jp01.part07;

/* Generic(jdk 1.5 �߰����)
 * ArrayList ���� �� ������ ������Ÿ���� �̸� ���𰡴�
 * ������ ���� �� ������ ������Ÿ���� �����Ǿ� ������ ����� ����ȯ ���ʿ�
 */

import java.util.*;

public class ArrayListTest03 {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>(10);
		
		String s1=new String("1.ȫ");
		arrayList.add(s1);
		arrayList.add(new String("2.��"));
		arrayList.add("3.�� �ȳ��ϼ���");
		
		for(int i=0; i<arrayList.size(); i++){
			//Generic ������� ����� ����ȯ ���ʿ�
		    System.out.print(arrayList.get(i));
		}
		
		System.out.print("\nJDK1.5�� �߰��� ��� ::Generic, Enhanced For Loop");
		//Vector ���ο� ����� ���� size()��ŭ �ݺ�, 1ea�� ���� String��
		for(String value:arrayList) {
		    System.out.print(value);
		}
		
		System.out.println("\n =>APIȮ��");
		arrayList.add(1,"4.��");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n =>APIȮ��");
		arrayList.set(1,"4.��");
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}
		
		System.out.println("\n =>APIȮ��");
		arrayList.remove(3);
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i));
		}

	}

}

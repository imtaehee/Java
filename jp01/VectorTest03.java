//package jp01.part07;;

/*
 * Generic:jdk 1.5�߰����
 * Vector������ �����϶� ������Ÿ�� �̸� ���𰡴�
 * data���� �� �����϶� ������Ÿ���� �����Ǿ� ������ ����� ����ȯ ���ʿ�
 */

import java.util.*;

public class VectorTest03 {
	
	public static void main(String[] args) {
		
		//Vector ��ü ������ ����(����,����)�� �ν��Ͻ� ������Ÿ�� ���
		List <String> vector=new Vector<String>(10,10);
		
		//Vector�� String ����
		//add(E obj): E�� ���ڷ� �޴´ٴ� �ǹ̴�? :: Generic ������� ������ ����ȯ ���ʿ�
		String s1=new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("3.�� �ȳ�");
		
		//Vector ����� �� ���
		for(int i=0; i<vector.size(); i++){
		    String s =vector.elementAt(i);
		    System.out.print(s);
		    //System.out.print(vector.elementAt(i));
		}
		
		System.out.print("\nJDK1.5�� �߰��� ��� ::Generic, Enhanced For Loop");
		//Vector ���ο� ����� ���� size()��ŭ �ݺ�, 1ea�� ���� String��
		for(String value:vector) {
		    System.out.print(value);
		}
		
		System.out.println("\n =>APIȮ��");
		vector.insertElementAt("4.��",1);
		//vector.set(1, "4.��");
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n =>APIȮ��");
		vector.setElementAt("5.ȫ���",3);
		//vector.set(3,"5.ȫ���");
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
		
		System.out.println("\n =>APIȮ��");
		vector.removeElementAt(3);
		for(int i=0; i<vector.size(); i++){
			System.out.print(vector.elementAt(i));
		}
	}

}

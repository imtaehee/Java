//package jb01.test;

/*
 �̸��� ��ȭ��ȣ�� �Է¹ް� ����ϴ� ����
 FileName : Test1.java
 
 ���� ��> java Test1 ȫ�浿 011-111-1111
 ==>������(��°��...)
 ���� �̸��� "ȫ�浿"�Դϴ�
 "ȫ�浿"���� [hp]�� "011-111-1111"�Դϴ�.
 */

public class Test1 {
	public static void main(String[] args) {
		//System.out.println("���� �̸���\"" + args[0] + "\"�Դϴ�.");
		//System.out.println("\"" + args[0] + "\"���� [hp]�� \"" + args[1] + "\"�Դϴ�.");	
		

		String name = args[0];
		String hp = args[1];

		System.out.println("���� �̸��� \"" + name + "\"�Դϴ�.");
		System.out.println("\"" + name + "\"�� [hp]�� \"" + hp + "\"�Դϴ�.");

	}

}
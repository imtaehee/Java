package jb01.part07;

/*
 FileName : IfElseETC.java
 
 1. ���ڸ� int Data Type���� �����ϴ� Integer.parseInt() ���
 3. Ư������ ����ϱ�(\t, \n, \")
 
 ������ ��>>java IfElseETC 1 2
 */
public class IfElseETC 
{
	///main method
	public static void main(String args[]) {
		//==>\" ���Ȯ��
		System.out.println("�Է��Ͻ�\"1��° �μ�\"�� : " + args[0]);
		System.out.println("�Է��Ͻ�\"2��° �μ�\"�� : " + args[1]);
		
		System.out.println("=======================================");
		
		//�Է��� ���ڸ� int Data Type���� �����ϴ� Integer.parselnt() ���
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		//i,j ������ ���� Ȯ������.
		System.out.println("i=" + i + "\tj=" + j);    //<<==Ư������ \t ��� : ��°�� Ȯ��
		System.out.println("���� ó��\n");    //<<==��������\n ��� : ��°�� Ȯ��
		System.out.println("=======================================");
		
		if(i>j) {
			System.out.println("i�� j���� Ů�ϴ�.");
		}else if(i==j) {
			System.out.println("i�� j�� �����ϴ�.");
		}else if(i<j) {
			System.out.println("i���� j�� Ů�ϴ�.");
		}
	}//end of main

}//end of class

//package jb01.test;
/*
 ���ڸ� �Է¹޾�(1~100) 90�̻� ��, 80���̻� ��, 70���̻� ��, 60���̻� ��
 �� ���ϴ� ���� ����ϱ�
 (�Է��� ���� 0~100���� �̾�� �Ѵ�. ���̻� �������� ��� ��� ó���� ���ΰ�)
 FileName : Example1.java

���� ��> java Example1 95
==>������(��°��)
�Է��Ͻ� �� 95���� ���Դϴ�.
*/

public class Example1 {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);

		//if (num<=100 & num>=90){
		//	System.out.println("��");
		//}else if (num<90 & num>=80){
		//	System.out.println("��");
		//}else if (num<80 & num>=70){
		//	System.out.println("��");
		//}else if (num<70 & num>=60){
		//	System.out.println("��");
		//}else if (num<60 & num>=0){
		//	System.out.println("��");
		
	   if (args.length!=1){
			System.out.println("�ϳ��� ���ڸ� �Է��ϼ���.");
			return;
		}
		
		if (num>100 || num<0){
			System.out.println("0~100 ������ ������ �Է��ϼ���.");
		    return;
		}			
        

		String grade = "��";

		switch ((int)num/10){
			case 10:
			case 9:
			    break;
			case 8:
				grade = "��";
				break;
			case 7:
				grade = "��";
			    break;
			case 6:
				grade = "��";
			    break;
			default:
				grade = "��";
			    break;
		}
		System.out.println("�Է��Ͻ� �� " +num+ "���� " +grade+ "�Դϴ�.");
	}
}

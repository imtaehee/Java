//package jb02.part04;
/*
 * ���ڿ��� �����ϴ� String Array(String[][] text = new String[9][9]�� �����,
 * ������ ���ڿ��� text Array�� �����Ͽ� ����ϴ� ����
 * 
 * ���� ��>java Example5
 * ==> ������(��°��)
 * 1���� ����մϴ�.
 * text[0][0] : 1*1 = 1
 * text[0][1] : 1*2 = 2
 * ...
 * text[8][8] : 9*9 = 81
 * 
 * ==>�Ʒ��� ������ �����Ͽ� ������
 * int l = 9;
 * int j = 9;
 * text [8][8] = l + "*" + j + "=" + l*j
 */

public class Example5 {
	public static void main(String args[]) {
		
		String[][] text = new String[9][9];
		
		for(int i=0; i<text.length; i++){
			System.out.println((i+1) + "���� ����մϴ�.");
			for(int j=0; j<text.length; j++){
				text[i][j] = ""+(i+1)*(j+1);
				
				System.out.println("text[" + i+ "]["+  j + "] : " +(i+1) + "x" +( j+1) + "=" + (i+1)*(j+1));
			}
		}
	}

}
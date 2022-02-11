//package jb02.part03;

/*
 * keyword : continue; ==> continue ���� ���๮�� �ߴ�, �ٽ� �ݺ��� ����
 * 
 * continue���� �̿� ¦���� ���ϱ�
 * java ContinueTest 5 ==> 1~5�� ¦���� 2,4�� ���� 6�� ���
 */

public class ContinueTest {
	public static void main(String[] args) {
		//�Է¹��� data�� int��ȯ
		int inputData = Integer.parseInt(args[0]);
		
		//���� ���� �����ϱ� ���� ����
		int sum=0;
		
		for(int i =0;  i<inputData ;i++) {
			if(i%2==1) { //Ȧ���̸�
				continue;
			}
			sum += i;
			
			//�Ʒ��� ������ for��ȯ���� �����ϸ�
			//������ ���� ��ȭ�� Ȯ���ϱ� ���� ��¹� (DEBUG)
			//System.out.println("i : " + i);
			//System.out.println("sum : " + sum);
		}
		System.out.println("0~" + inputData + "������ ¦���� ���� : " + sum);
	}

}
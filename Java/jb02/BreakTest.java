//package jb02.part03;

/*
 keyword break ==> �ڽ��� ���� �ݺ����� ����
 break���� �̿��Ͽ� �Է¹��� �������� ���� ������
 java BreakTest 10 ==> 1~10 ���ؼ� 55���
 */
public class BreakTest {
	public static void main(String[] args) {
		//�Է¹��� data�� int��ȯ
		int inputData = Integer.parseInt(args[0]);
		
		//while���� �ʱ�ȭ���� ����
		int i = 0;
		
		//���� ���� �����ϱ� ���� ��������
		int sum = 0;
		
		while(true) {
			i++;
			sum += i;
			
			if(i==inputData) {
				break;
			}
		}
		System.out.println("1~" + inputData + "������ ����: " + sum + "�Դϴ�.");
	}

}

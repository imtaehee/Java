package jb02.part02;

/*
 FileName : ForTest.java
 1. for(�ʱⰪ;����;��ȭ��)���� �̿�
 2. while(����)���� do while(����)������ 
 ������ �� Ȱ��Ȯ��
 */
public class ForTest {
	public static void main(String args[]) {
		int j =5;
		System.out.println("���� ����մϴ�.");
		
		//for ���� while ���� �޸� �ʱ�ȭ�� for�� ���ο��� �Ѵ�.
		for(int i = 1; i<10; i++) {
			System.out.println(j + "*" + i + "=" + j*i);
		}
		
		//==>�ݸ� for/while ���� ������ ����
		int k = 1;
		while(k<10) {
			System.out.println("5*" + k + "=" + 5*k);
			k++;
		}
		
		System.out.println("i�� �������� �� : " + j);
		System.out.println("k�� �������� �� : " + k);
		
		//==> ���ѷ����� ���ѷ����Ĵ��� ���๮���� compile error�� �����ϸ�
		for(;;) {
			System.out.println("����� �ݺ��г����� ���ѷ���");
		}
		//==>�Ʒ��� �ּ��� Ǯ�� compile error�� �߻��Ѵ�. ������
		//System.out.println("errpr�� �߻��Ѵ�. ������");
	}

}

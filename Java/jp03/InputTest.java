//package jp03.part01;

//java.io package : ���α׷� �ܺη� �ڿ��ްų� ���޿� ���(Ű����)

import java.io.*;

public class InputTest{
	public static void main(String[] args) {

		//InputStrea:: ǥ���Է���ġ �߻�ȭ�� class
		InputStream inputStream=System.in;
		
		System.out.println("�Է��� ��ٸ��ϴ�.");

		try{
			//���� �о���̴� ���� loop����
			while(true){
				//1. java.io�� ����(block)�� �� �ִ�.
				int i=inputStream.read();
				char c=(char)i;

				//2. java.io�� FIFO�� ����
				System.out.println("�Է��Ͻ� ��: "+c);

				//=> char 'x'�� �ԷµǸ� while����
				if(c=='x'){
					inputStream.close();
					break;
				}
				//�ѱ��Է½� ������ �ѱ� 1EA�� 2�� ����°� Ȯ��
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
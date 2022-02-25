//package jp03.part05;

/*
FileCopy�ϴ� application �ۼ�
1. Ű����� ���ϳ��� �Է�
2. ������ ������ read() => FileReader
3. ������ ������ write() => FileWriter
*/

import java.io.*;

public class FileWriterTestFilter01{
	public static void main(String[] args) {

		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br=null;
		BufferedWriter br=null;
		String fileName="";
		String copyFileName"";

		int readCount=0; //read�� count�ϱ� ���� ����

		System.out.print("copy�� file �̸��� �Է��ϼ���.");
		fileName=new BufferedReader(new InputStreamReader(System.in)).readLine();

		//�������� �����͸� read�� �� �ִ� BufferedReader����
		br=new BufferedReader(new FileReader(fileName));

		//�纻���� �̸� �����
		copyFileName=fileName+ "_copy";
		//�����͸� write�� �� �ִ� BufferedWriter ����
		bw=new BufferedWriter(new FileWriter(copyFileName);

		//read/write �ϴ� while��
		String source=null;
		while((source=br.readLine()) != null){
			bw.write(source);
			readCount++;
		}
		bw.flush(); //��������

		//Stream close()
		bw.close();
		br.close();

		System.out.println("\n\n==================================");
		System.out.println("=====>>> read Ƚ�� readCount:"+readCount);
		System.out.println("==================================");
		
	}
}
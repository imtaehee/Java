//package jp03.part05;

//Ű����� �Է¹��� ���� test.txt�� ������ application �ۼ�

import java.io.*;

public class FileWriterTestFilter02{
	public static void main(String[] args) throws Exception{

		//�ʿ䰴ü Stream/String �ν��Ͻ� declaration
		BufferedReader br=null;
		BufferedWriter br=null;

		//Ű����� �Է¹ް� ���� Sink Stream Reader ��
		//1���� line�� �б����� reaLine() method�� �����ϴ� BufferedReader ����
		//Reader r=new InputStreamReader(System.in);
		//br=new BufferedReader(r);
		br=new BufferedReader(new InputStreamReader(System.in));

		//File�� �� �������� FileWriter �� BufferWriter ����
		//FileWriter fw=new FileWriter("test.txt");
		//bw=new BufferedWriter(fw);
		bw=new BufferedWriter(new FileWriter("test.txt");  //API Ȯ��
		//bw=new BufferedWriter(new FileWriter("test.txt", true);  API Ȯ��

		System.out.println("���Ͽ� ������ ���� �Է��ϼ���.");
		while(true){
			String str=br.readLine();
			if(str.equals("��")){
				break;
			}
			bw.write(str,0,str.length());  //AP�� Ȯ��
			bw.newLine();  //API Ȯ�� �ٹٲٱ�

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

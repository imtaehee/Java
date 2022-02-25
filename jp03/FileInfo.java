//package jp03.part07;

import java.io.*;

public class FileInfo{
	public static void main(String[] args) {

		System.out.println("�����̸��� ��������.");

		String name="";
		//==> NullString => String s=new String() �� ���� �ǹ�
		//==> String s=null�� ����

		//�����̸��� �޾Ƶ���
		try{
			BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			name=in.readLine();
		}catch(Exception e){
			e.printStackTrace();
		}

		//file class ��ü ����
		File file=new File(name);

		//file�� �����Ѵٸ� file ���õ� information ���
		if(file.exists()){
			System.out.println("���� �̸�:"+ file.getName());
			System.out.println("��� �н�:"+ file.getPath());
			System.out.println("���� �н�:"+ file.getAbsoulutePath());
			System.out.println("���� ����:"+ file.canWrite());
			System.out.println("�б� ����:" +file.canRead());
			System.out.println("���� ����:" +file.length()+"����Ʈ");
		}else{
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
		
	}
}

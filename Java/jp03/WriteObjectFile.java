//package jp03.part06;

//ObjectOutputStream �� �̿� ȸ�������� ���� UserVo instance��
//(��ü�� ���¸� ���´�/����������) persistence data(File)�� ����

import java.io.*;

public class WriteObjectFile{
	public static void main(String[] args) {

		//1. instance�� File�� ������ SinkStream :: FileOutputStream ����
		//2. instance�� �����ϴ� FilterStream: ObjectOutputStream ����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1, "ȫ�浿"));  //API Ȯ��
		oos.writeObject(new UserVO(2, "ȫ���"));  //API Ȯ��
		oos.flush();

		//Stream close()
		oos.close();
		
	}
}
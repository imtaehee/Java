//package jp03.part06;

public class ReadObjectFile{
	public static void main(String[] args) {

		//1. File���� instance �� ���� SinkStream::FileStream ����
		//2. instance�� �д� FilterStream: ObjectInpuStream ����
		ObjectInputStream ois = new ObjectOutputStream(new FileInputStream("UserInfo.obj"));

	    UserVO user01=(UserVO)ois.readObject();  //API Ȯ�� ����� ����ȯ ����
		UserVO user02=(UserVO)ois.readObject();  //API Ȯ�� ����� ����ȯ ����

		System.out.,println("1��° ȸ������::"+user01);
		System.out.,println("1��° ȸ������::"+user02);

		//Stream close();
		ois.close();		
	}
}

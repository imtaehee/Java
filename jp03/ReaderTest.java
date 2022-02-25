//package jp03.part01;

//InputStream�� �ѱ�ó��(2byte)�� �������� ����ó���ϴ� Reader�迭�� �ٲٸ�?

public class ReaderTest{
	public static void main(String[] args) {

		try{
			//InputStream::ǥ���Է���ġ �߻�ȭ�� class
			InputStream inputStream=System.in;
			//InputStream�� Reader�� ����(byteó��=> ����ó�� ����)
			Reader reader=new InputStreamReader(inputStream);

			System.out.println("�Է��� ��ٸ��ϴ�.");

			while(true){
				//1. java.io�� ����(block)�� �� �ִ�.
				int i=reader.read();
				char c=(char)i;

				//2. java.io�� FIFO�� ����
				System.out.println("�Է��Ͻ� ��: "+c);

				//=> char 'x'�� �ԷµǸ� while����
				if(c=='x'){
					inputStream.close();
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
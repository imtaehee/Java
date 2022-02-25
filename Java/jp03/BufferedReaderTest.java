//package jp03.part04;

/*
1.read() method���� ȿ������ method�� �����ϴ� class ����
2. Sink stream : data�� ���� �ְ�޴� �ܼ� ����� stream
   Filter stream : Sink stream�� ���� ���� data �����ϴ� stream
   ���� ����
*/

public class BufferedReaderTest{
	public static void main(String[] args) throws Exception{

		//read �� count ���� ����
		int readCount=0;

		//SinkStream => ���ܿ��� �ܼ� ����¸� ���
		FileReader fr=new FileReader(args[0]);
		//FileStream=> �߰����� �������
		BufferedReader br=new BufferedReader(fr)


        //���� �� line�� ��
		BufferedReader br=new BufferedReader(new FileReader(args[0]));

		String oneLine=null;

	    while(true){

			readCount++;

			oneLine=br.readLine();
			if(oneLine==null){
				break;
			}
			System.out.println("���� ���: "+readCount+ " "+ oneLine);
		}

		//Stream close
		br.close();
		fr.close();
		
	}
}

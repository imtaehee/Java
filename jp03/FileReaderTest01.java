//package jp03.part03;

public class FileReaderTest01{
	public static void main(String[] args) {
		//File�� �о���̴� Stream ����
		FileReader fr=null;
		//read() �� count ���� ����
		int readCount=0;

		try{
			fr=new FileReader(args[0]);

			while(true){
				int i=fr.read();

				if(i==-1){//i=-1�� �ǹ̴�=> API Ȯ��
				    break;
				}

				char c=(char)i;
				System.out.print(c);

				readCount++;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}finally{
			System.out.println("\n\n==================================");
			System.out.println("=====>>> read Ƚ�� readCount:"+readCount);
			System.out.println("==================================");
			try{
				fis.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}
}

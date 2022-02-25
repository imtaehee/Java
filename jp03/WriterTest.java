//package jp03.part02;

/*
1. byte처리를 위한 Stream인 input/output Stream을 이용하여
   키보드로 입력, 모니터로 출력하는 예
2. 한글처리(문자처리)를 위하여 Reader/Writer 계열로 바구어 입출력
*/

public class WriterTest{
	public static void main(String[] args) {

		try{
			//InputStream::표준입력장치 추상화한 class
			InputStream inputStream=System.in;
			//문자처리를 위한 Reader로 변경			
			Reader reader=new InputStreamReader(inputStream);

			//OutputStream::표준출력장치 추상화한 class
			OutputStream outputStream=System.out;
			//문자처리를 위한 Writer로 변경
			Writer writer=new OutputStreamWriter(outputStream);

			System.out.println("입력을 기다립니다.");

			while(true){
				//1. java.io는 지연(block)될 수 있다.
				int i=reader.read();
				writer.write(i);
				writer.flush();

				if(c=='x'){
					inputStream.close();
					break;
				}
			}
			//while문 내부의 flush()와 밖의 flush()의 의미는?
			//w.flush();

			//Stream close();
			reader.close();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

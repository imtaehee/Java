//package jp03.part04;

/*
1.read() method보다 효율적인 method를 제공하는 class 제공
2. Sink stream : data를 직접 주고받는 단순 입출력 stream
   Filter stream : Sink stream을 통해 들어온 data 조작하는 stream
   차이 이해
*/

public class BufferedReaderTest{
	public static void main(String[] args) throws Exception{

		//read 수 count 위한 변수
		int readCount=0;

		//SinkStream => 말단에서 단순 입출력만 담당
		FileReader fr=new FileReader(args[0]);
		//FileStream=> 추가적인 기능제공
		BufferedReader br=new BufferedReader(fr)


        //위의 두 line과 비교
		BufferedReader br=new BufferedReader(new FileReader(args[0]));

		String oneLine=null;

	    while(true){

			readCount++;

			oneLine=br.readLine();
			if(oneLine==null){
				break;
			}
			System.out.println("한줄 출력: "+readCount+ " "+ oneLine);
		}

		//Stream close
		br.close();
		fr.close();
		
	}
}

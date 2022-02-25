//package jp03.part05;

//키보드로 입력받은 내용 test.txt로 보내는 application 작성

import java.io.*;

public class FileWriterTestFilter02{
	public static void main(String[] args) throws Exception{

		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br=null;
		BufferedWriter br=null;

		//키보드로 입력받가 위한 Sink Stream Reader 및
		//1개의 line을 읽기편한 reaLine() method를 제공하는 BufferedReader 생성
		//Reader r=new InputStreamReader(System.in);
		//br=new BufferedReader(r);
		br=new BufferedReader(new InputStreamReader(System.in));

		//File에 글 쓰기위한 FileWriter 및 BufferWriter 생성
		//FileWriter fw=new FileWriter("test.txt");
		//bw=new BufferedWriter(fw);
		bw=new BufferedWriter(new FileWriter("test.txt");  //API 확인
		//bw=new BufferedWriter(new FileWriter("test.txt", true);  API 확인

		System.out.println("파일에 저장할 글을 입력하세요.");
		while(true){
			String str=br.readLine();
			if(str.equals("끝")){
				break;
			}
			bw.write(str,0,str.length());  //AP기 확인
			bw.newLine();  //API 확인 줄바꾸기

		}
		bw.flush(); //잊지말기

		//Stream close()
		bw.close();
		br.close();

		System.out.println("\n\n==================================");
		System.out.println("=====>>> read 횟수 readCount:"+readCount);
		System.out.println("==================================");
		
		
	}
}

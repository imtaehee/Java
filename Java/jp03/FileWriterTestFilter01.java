//package jp03.part05;

/*
FileCopy하는 application 작성
1. 키보드로 파일네임 입력
2. 파일의 내용을 read() => FileReader
3. 파일의 내용을 write() => FileWriter
*/

import java.io.*;

public class FileWriterTestFilter01{
	public static void main(String[] args) {

		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br=null;
		BufferedWriter br=null;
		String fileName="";
		String copyFileName"";

		int readCount=0; //read를 count하기 위한 변수

		System.out.print("copy할 file 이름을 입력하세요.");
		fileName=new BufferedReader(new InputStreamReader(System.in)).readLine();

		//원본파일 데이터를 read할 수 있는 BufferedReader생성
		br=new BufferedReader(new FileReader(fileName));

		//사본파일 이름 만들기
		copyFileName=fileName+ "_copy";
		//데이터를 write할 수 있는 BufferedWriter 생성
		bw=new BufferedWriter(new FileWriter(copyFileName);

		//read/write 하는 while문
		String source=null;
		while((source=br.readLine()) != null){
			bw.write(source);
			readCount++;
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

//package jp03.part01;

//java.io package : 프로그램 외부로 자원받거나 전달에 사용(키보드)

import java.io.*;

public class InputTest{
	public static void main(String[] args) {

		//InputStrea:: 표준입력장치 추상화한 class
		InputStream inputStream=System.in;
		
		System.out.println("입력을 기다립니다.");

		try{
			//값을 읽어들이는 무한 loop시작
			while(true){
				//1. java.io는 지연(block)될 수 있다.
				int i=inputStream.read();
				char c=(char)i;

				//2. java.io는 FIFO의 구조
				System.out.println("입력하신 값: "+c);

				//=> char 'x'가 입력되면 while종료
				if(c=='x'){
					inputStream.close();
					break;
				}
				//한글입력시 깨진다 한글 1EA당 2개 생기는것 확인
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}

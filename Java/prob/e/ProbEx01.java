//package e.api.ex01;

/*
 * Caesar Cipher는 암호화의 대상이 되는 각각의 문자들을 알파벳상의 
 * 세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법 (공백제외)
 */

public class ProbEx01 {
	public static void main(String[] args) {
		String sourceString="everyday we have is one more than we deserve";
		String encodedString="";
		
		int encodedNumber=0;
		
		for(int k=0; k<sourceString.length(); k++) {
			
			int a=(int)sourceString.charAt(k);
			
			if(a==32) {//공백일 때
				encodedNumber=32;				
			}else if(a+3>122) { //3후 알파벳이 z넘어갈때
				encodedNumber=a-23;
			}else {
			 	encodedNumber=a+3;
		    }
			
		    encodedString +=(char)encodedNumber;
		    }

		System.out.println("암호화된 문자열: "+sourceString);
		System.out.println("암호화된 문자열: "+encodedString);
	}

}

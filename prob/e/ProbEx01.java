//package e.api.ex01;

/*
 * Caesar Cipher�� ��ȣȭ�� ����� �Ǵ� ������ ���ڵ��� ���ĺ����� 
 * ����° ������ ���ڷ� ġȯ�ϴ� ������ ġȯ ��ȣ��� (��������)
 */

public class ProbEx01 {
	public static void main(String[] args) {
		String sourceString="everyday we have is one more than we deserve";
		String encodedString="";
		
		int encodedNumber=0;
		
		for(int k=0; k<sourceString.length(); k++) {
			
			int a=(int)sourceString.charAt(k);
			
			if(a==32) {//������ ��
				encodedNumber=32;				
			}else if(a+3>122) { //3�� ���ĺ��� z�Ѿ��
				encodedNumber=a-23;
			}else {
			 	encodedNumber=a+3;
		    }
			
		    encodedString +=(char)encodedNumber;
		    }

		System.out.println("��ȣȭ�� ���ڿ�: "+sourceString);
		System.out.println("��ȣȭ�� ���ڿ�: "+encodedString);
	}

}

//package e.api.ex05

//�Ű������� ���� ���ڿ� �迭���� 'a'�� ���� ���� ���ڿ��� a�� �빮�� A�� ����

public class StringUtil{

	private static String replaceString(String[] arr){

		int count=0;
		int[] inArr=new int[arr.length];
		String a="a";
		String str="";

		for(int k=0; k<arr.length; k++){
			for(int i=0; i<arr[k].length(); i++) {
				
				if(arr[k].charAt(i) == 'a') {
				    count++;
				}
				inArr[k]=count;
			}
			count=0;
		}
		
		for(int k=0; k<inArr.length; k++) {
			
			int max=inArr[0];
			
			if(max<inArr[k]) {
				max=inArr[k];
			}
		
			if(max==inArr[k]) {
				str=arr[k].replace('a', 'A');
			}
		}	
		return str;
	}
	
	public static void main(String[] args) {

		String[] arr={"java program", "array", "java program area", "append"};
		String result=StringUtil.replaceString(arr);
		System.out.println("����� ���ڿ� " +result);
		
	}
}

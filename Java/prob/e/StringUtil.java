//package e.api.ex05

//매개변수로 받은 문자열 배열에서 'a'가 가장 많은 문자열의 a를 대문자 A로 변경

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
		System.out.println("변경된 문자열 " +result);
		
	}
}

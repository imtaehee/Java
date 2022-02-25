//package e.api.ex03;

//leftPad method

public class ProbEx03{
	public String leftPad(String str, int size, char padChar){

		String result="";
		
		if(str.length()>size){
			result=str;
		}else{
			for(int k=1; k<=(size-str.length()); k++){
				result +=padChar;
		    }
			result += str;
		}

		return result;
	}

	public static void main(String[] args) {

		ProbEx03 prob3=new ProbEx03();

		System.out.println(prob3.leftPad("ABC",6,'#'));
		System.out.println(prob3.leftPad("ABC",5,'$'));
		System.out.println(prob3.leftPad("ABC",2,'&'));
		
	}
}

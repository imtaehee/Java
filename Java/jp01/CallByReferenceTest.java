//package jp01.part02;                                                                                                                                                                                                   

public class CallByReferenceTest{

	int number=100;

	public void referenceChange(CallByReferenceTest value){
		System.out.println("================================");
		value.number=100+value.number;
		System.out.println("value.number: "+value.number);
		System.out.println("================================");
	}

	public static void main(String[] args){
		CallByReferenceTest call=new CallByReferenceTest();

		//method의 인자값으로 call(Reference data type)
		call.referenceChange(call);
		System.out.println("call.number: "+call.number);
	}
}

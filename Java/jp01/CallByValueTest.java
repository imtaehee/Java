//package jp01.part02;

//primitive type variable :Method ���� => call by value

public class CallByValueTest{

	int number=100;

	public void valueChange(int value){
		System.out.println("============================");
		value=value+100;
		System.out.println("value:" +value);
		System.out.println("============================");
	}

	public static void main(String[] args){
		CallByValueTest call=new CallByValueTest();

		//method�� ���ڰ����� int(primitive data type)
		call.valueChange(call.number);
		System.out.println("number:" +call.number);
	}
}

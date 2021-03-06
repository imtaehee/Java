//package jp02.part02;

//해결 : JVM에서 던진건 program내부에서 throws하던 Exception(예외처리)
//의 해결책은 try-catch

public class ExceptionTest04{
	//Field
	private int sum;
	private int avg;

	//Constructor
	public ExceptionTest04(){
	}

	//Method
	public void sum(int x,int y){
		System.out.println("1==> sum 시작");
		sum=x+y;
		System.out.println("1==> 합:" +sum);
		System.out.println("1==> sum 끝");
	}

	//JVM에서 던진 ArithmeticException을 다시 자신을호출한 곳으로 위임한다
	public void avg(int z) throws ArithmeticException{
		System.out.println("2==> avg 시작");
		//z=0인 경우 불능
		avg=sum/z;
		System.out.println("2==> 평균:" +avg);
		System.out.println("2==> avg 끝");
	}

	//main
	public static void main(String[] args){

		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		int k=Integer.parseInt(args[2]);
		
		ExceptionTest04 et=new ExceptionTest04();
		et.sum(i,j);

		//JVM에서 던지건 program 에서 throws하던 Exception(예외처리)의 해결책은 try-catch
		try{
			et.avg(k);
		}catch(ArithmeticException e){//현재라인 주석처리하고 아래 주석풀고 실행하면
		//}catch(Exception e){  //Exception e=new ArithmeticException()은 가능한가?
		    System.out.println("1.>>=============================================");
			System.out.println("et.avg(k)에서 Exception이 발생한 모양");
			System.out.println("2.>>=============================================");
			System.out.println(e);
			System.out.println("3.>>=============================================");
			e.printStackTrace();
			System.out.println("4.>>=============================================");
		}

		System.out.println("main method end");
	}

}

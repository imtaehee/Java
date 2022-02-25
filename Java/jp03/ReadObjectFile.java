//package jp03.part06;

public class ReadObjectFile{
	public static void main(String[] args) {

		//1. File에서 instance 를 읽을 SinkStream::FileStream 생성
		//2. instance를 읽는 FilterStream: ObjectInpuStream 생성
		ObjectInputStream ois = new ObjectOutputStream(new FileInputStream("UserInfo.obj"));

	    UserVO user01=(UserVO)ois.readObject();  //API 확인 명시적 형변환 이유
		UserVO user02=(UserVO)ois.readObject();  //API 확인 명시적 형변환 이유

		System.out.,println("1번째 회원정보::"+user01);
		System.out.,println("1번째 회원정보::"+user02);

		//Stream close();
		ois.close();		
	}
}

//package jp03.part06;

//ObjectOutputStream 을 이용 회원정보를 갖는 UserVo instance를
//(객체는 상태를 갖는다/상태정보를) persistence data(File)로 저장

import java.io.*;

public class WriteObjectFile{
	public static void main(String[] args) {

		//1. instance를 File에 저장할 SinkStream :: FileOutputStream 생성
		//2. instance를 전송하는 FilterStream: ObjectOutputStream 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1, "홍길동"));  //API 확인
		oos.writeObject(new UserVO(2, "홍길순"));  //API 확인
		oos.flush();

		//Stream close()
		oos.close();
		
	}
}

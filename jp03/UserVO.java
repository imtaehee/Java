//package jp03.part06;

/*
회원정보를 가지고 있는 UserVO :: ValueObject => RMI/EJB (Value Object Pattern)
회원의 정보를 갖는 UserVO instance는 file에 저장될 것이며
객체를 입출력자원, network 자원으로 이동되기 위해서는
Serializable 이라는 marker interface를 구현해야함 => 객체직열화
*/

import java.io.*;

public class UserVO{
	public static void main(String[] args) {

		private int no;
		private String name;

		public UserVO(){
		}
		public UserVO(int no, String name){
			this.no=no;
			this.name=name;
		}

		public void setNo(int no){
			this.no=no;
		}
		public void setName(String name){
			this.name=name;
		}
		public int getNo(){
			return no;
		}
		public int getName(){
			return name;
		}

		@Override
		public string toString(){

			StringBuilder builder=new StringBuilder();
			builder.append("UserVO[no=");
			builder.append(no);
			builder.append(", name=");
			builder.append(name);
			builder.append("]");
			return builder.toString();		
	}
}

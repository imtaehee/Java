//package jp03.part06;

/*
ȸ�������� ������ �ִ� UserVO :: ValueObject => RMI/EJB (Value Object Pattern)
ȸ���� ������ ���� UserVO instance�� file�� ����� ���̸�
��ü�� ������ڿ�, network �ڿ����� �̵��Ǳ� ���ؼ���
Serializable �̶�� marker interface�� �����ؾ��� => ��ü����ȭ
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

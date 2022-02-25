//package jp01.part09;

//java.util.HashSet: data의 중복을 허용하지 않는 자료저장

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set <String> hs=new HashSet<String>();
		
		String str=new String("A");
		boolean isAddOk=hs.add(str);
		System.out.println("저장유무:"+isAddOk);
		
		isAddOk=hs.add("b");
		System.out.println("저장유무:"+isAddOk);
		
		isAddOk=hs.add("B");
		System.out.println("저장유무:"+isAddOk);
		
		System.out.println("저장된 data갯수"+hs.size());
		if(hs.contains("b")) {
			System.out.println("저장된 data b를 삭제함");
			hs.remove("b");
		}
		System.out.println("저장된 data갯수:"+hs.size());
		
	}

}

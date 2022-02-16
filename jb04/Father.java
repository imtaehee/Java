//package jb04.part07;

/*
 * Encapsulation(information hiding)을 지원하는 Access Modifier 이해
 * public/protected/(  )/private의 사용 및 이해
 */

public class Father {
	public String name="홍길동";        //public:누구나 접근가능
	protected String bank="한양은행";   //protected:상속관계, 같은 package 접근가능
	String branch="역삼동지점";          //(  ):같은 package 접근가능
	private int password=1234;        //private:자신만 접근가능
	
	public Father() {
	}
	
	//각각의 Field아래의 Method를 통해 접근이 가능
	//아래의 각각의 getter Method 의 의미를 이해
	
	public String getBank(int pwd) {
		if(pwd!=7777) {
			return "key값을 정확히 입력하세요";
		}else {
			return this.bank;
		}
	}
	
	public int getPassword(int key) {
		if(key!=7777) {
			return 0;
		}else {
			return this.password;
		}
	}
	
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}

}

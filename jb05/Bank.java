//package jb05.part08;

//abstract class는 interface(기능의정의)와 달리
//일반공유 method와 Field를 가질수 있다.

public avstract class Bank{

	private String name;

	public Bank(){
	}
	public Bank(String name){
		this.name=name;
}

//은행명을 출력하는 display method를 추상method로 정의
    public abstract void display();

    public String getName(){
	    return name;
    }
    public void setName(String name){
    	this.name=name;
    }   

}


//package jb05.part08;

//abstract class�� interface(���������)�� �޸�
//�Ϲݰ��� method�� Field�� ������ �ִ�.

public avstract class Bank{

	private String name;

	public Bank(){
	}
	public Bank(String name){
		this.name=name;
}

//������� ����ϴ� display method�� �߻�method�� ����
    public abstract void display();

    public String getName(){
	    return name;
    }
    public void setName(String name){
    	this.name=name;
    }   

}


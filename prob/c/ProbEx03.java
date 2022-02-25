//package c.modeling.ex03;

/* ��°�
 * �� �� : ȫ�浿   �� �� : 20   ��  �� : 200201
 * �� �� : �̼���   �� �� : 30   ������ : JAVA
 * �� �� : ������   �� �� : 40   ��  �� : ������
 */

//Student class
class Student{
	//Field
	private String name;
	private int age;
	private int id;
	
	//Constructor
	public Student() {
	}
	public Student(String name, int age, int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	
	//print method
	public void print() {
		System.out.println("�� �� : "+name+"\t�� �� : "+age+"\t��  �� : "+id);
	}
}

//Teacher class
class Teacher{
	//Field
	private String name;
	private int age;
	private String subject;
	
	//Constructor
	public Teacher() {
	}
	public Teacher(String name, int age, String subject) {
		this.name=name;
		this.age=age;
		this.subject=subject;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	
	//print method
	public void print() {
		System.out.println("�� �� : "+name+"\t�� �� : "+age+"\t������ : "+subject);
	}
}

//Employee class
class Employee{
	//Field
	private String name;
	private int age;
	private String dept;
	
	//Constructor
	public Employee() {
	}
	public Employee(String name, int age, String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	
	//print method
	public void print() {
		System.out.println("�� �� : "+name+"\t�� �� : "+age+"\t��  �� : "+dept);
	}
}

//Main
public class ProbEx03 {
	public static void main(String[] args) {
		
		Student s=new Student("ȫ�浿",20,200201);
		Teacher t=new Teacher("�̼���",30,"JAVA");
		Employee e=new Employee("������",40,"������");
		
		s.print();
		t.print();
		e.print();
	}

}

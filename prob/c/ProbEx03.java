//package c.modeling.ex03;

/* 출력값
 * 이 름 : 홍길동   나 이 : 20   학  번 : 200201
 * 이 름 : 이순신   나 이 : 30   담당과목 : JAVA
 * 이 름 : 유관순   나 이 : 40   부  서 : 교무과
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
		System.out.println("이 름 : "+name+"\t나 이 : "+age+"\t학  번 : "+id);
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
		System.out.println("이 름 : "+name+"\t나 이 : "+age+"\t담당과목 : "+subject);
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
		System.out.println("이 름 : "+name+"\t나 이 : "+age+"\t부  서 : "+dept);
	}
}

//Main
public class ProbEx03 {
	public static void main(String[] args) {
		
		Student s=new Student("홍길동",20,200201);
		Teacher t=new Teacher("이순신",30,"JAVA");
		Employee e=new Employee("유관순",40,"교무과");
		
		s.print();
		t.print();
		e.print();
	}

}

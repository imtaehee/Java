//package c.modeling.ex03;
//School 을 상속받는 Student, Teacher, Employee

//School class
class School{
	//Field
	private String name;
	private int age;
	
	//Constructor
	public School() {
	}
	public School(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//print method
		public void print() {
			System.out.print("이 름 : "+name+"\t나 이 : "+age);
		}
}

//Student class
class Student extends School{
	//Field	
	private int id;
	
	//Constructor	
	public Student() {
	}
	public Student(String name, int age, int id) {
		super(name,age);
		this.id=id;
	}
	//setter
	public void setId(int id) {
		this.id=id;
	}
	//getter
	public int getId() {
		return id;
	}
	
	//print method
	public void print() {
		super.print();
		System.out.println("\t학  번 : "+id);
	}
}

//Teacher class
class Teacher extends School{
	//Field	
	private String subject;
	
	//Constructor	
	public Teacher() {
	}
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject=subject;
	}
	//setter
	public void setSubject(String subject) {
		this.subject=subject;
	}
	//getter
	public String getSubject() {
		return subject;
	}
	
	//print method
	public void print() {
		super.print();
		System.out.println("\t담당과목 : "+subject);
	}
}

//Employee class
class Employee extends School{
	//Field	
	private String dept;
	
	//Constructor	
	public Employee() {
	}
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
	}
	//setter
	public void setDept(String dept) {
		this.dept=dept;
	}
	//getter
	public String getDept() {
		return dept;
	}
	
	//print method
	public void print() {
		super.print();
		System.out.println("\t부  서 : "+dept);
	}
}

//Main
public class ProbEx03extends {

	public static void main(String[] args) {
		
		Student s=new Student("홍길동",20,200201);
		Teacher t=new Teacher("이순신",30,"JAVA");
		Employee e=new Employee("유관순",40,"교무과");
		
		s.print();
		t.print();
		e.print();
	}

}

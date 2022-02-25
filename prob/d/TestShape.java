//package d.inheritance.ex02;

//클래스다이어그램


abstract class Shape{

	//Field
	protected double area=0;
	private String name;

	//Constructor
	public Shape(){
	}
	public Shape(String name){
		this.name=name;
	}

	//setter,getter
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setArea(double area){
		this.area=area;
	}
	public double getArea(){
		return area;
	}

	//method
	public abstract void calculationArea();

	public void print(){
		System.out.print(name+"의 면적은 ");
	}

}

class Circle extends Shape{
	//Field
	private double radius=0;

	//Constructor
	public Circle(){
	}
	public Circle(String name, double radius){
		super(name);
		this.radius=radius;
	}

	//setter, getter
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}

	//method
	public void calculationArea(){
		area =radius*radius*3.14;
	}
	public void print(){
		super.print();
		System.out.println(area);
	}

}

class Rectangular extends Shape{
	//Field
	private double width=0;
	private double hight=0;

	//Constructor
	public Rectangular(){
	}
	public Rectangular(String shape, double width, double hight){
		super(shape);
		this.width=width;
		this.hight=hight;
	}

	//setter, getter
	public void setWidth(double width){
		this.width=width;
	}
	public double getWidth(){
		return width;
	}
	public void setHight(double hight){
		this.hight=hight;
	}
	public double getHight(){
		return hight;
	}

	//method
	public void calculationArea(){
		area=width*hight;
	}
	public void print(){
		super.print();
		System.out.println(area);
	}
}

public class TestShape{

	public static void main(String[] args){
		Shape[] shape=new Shape[2];

		shape[0]= new Circle("원", 10);
		shape[1]=new Rectangular("직사각형",10,20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}

	}
}

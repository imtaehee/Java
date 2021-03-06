//package c.modeling.ex01;

import java.util.Scanner;

class Rectangle{

	//Field
	String color;
	int width;
	int length;

	//setter
	public void setColor(String color){
		this.color=color;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public void setLength(int length){
		this.length=length;
	}
	
	//getter
	public String getColor(){
		return color;
	}
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}

	//넓이구하는 method
	public int area(){
		return (width*length);
	
	}
	//둘레길이 계산하는 method
	public int perimiter(){
		return ((width+length)*2);
	}
}


public class TestRectangle{
	public static void main(String s[]){

		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1=new Rectangle();
		System.out.println("첫번째 직사가형의 색깔");
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 가로");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 세로");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2=new Rectangle();
		System.out.println("두번째 직사가형의 색깔");
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 가로");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 세로");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor()+ "직사각형의 넓이는" + rec1.area()+
			"이고 둘레는" +rec1.perimiter()+ "입니다.");
		System.out.println(rec2.getColor()+ "직사각형의 넓이는" + rec2.area()+
			"이고 둘레는" +rec2.perimiter()+ "입니다.");

		//두 직사각형의 넓이비교
		if(rec1.area()>rec2.area()){
			System.out.println("넓이는 "+rec1.getColor()+ " 직사각형이 더 큽니다.");
		}else if (rec1.area()<rec2.area()){
			System.out.println("넓이는 "+rec2.getColor()+ " 직사각형이 더 큽니다.");
		}else {
			System.out.println("넓이는 같습니다.");
		}

		//두 직사각형의 둘레 비교
		if(rec1.perimiter()>rec2.perimiter()){
			System.out.println("둘레는 "+rec1.getColor()+ " 직사각형이 더 큽니다.");
		}else if (rec1.perimiter()<rec2.perimiter()){
			System.out.println("둘레는 "+rec2.getColor()+ " 직사각형이 더 큽니다.");
		}else {
			System.out.println("둘레는 같습니다.");
		}

	}
}

//package c.modeling.ex04;

/*
 * Book class
 * 책제목과 가격정보를 저장하는 변수 (private)
 * 변수 초기화하는 생성자메서드필요
 * setter,getter메서드 필요(public)
 * 
 * BookMgr class
 * Book 객체 여러개 저장할 수 있는 booklist라는 배열
 * 배열변수 초기화하는 생성사메서드
 * 모든 책 목록을 출력하는 printBooklist()
 * 모든 책 가격의 합을 출력하는 printTotalPrice()
 */


class Book{
	//Field
	private String title;
	private int price;
	
	//Constructor	
	public Book() {
	}
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
	}
	
	//setter
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	//getter
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
}

class BookMgr extends Book{
	//Field
	private Book[] booklist;
	
	//Constructor
	public BookMgr() {
	}
	public BookMgr(Book[] booklist) {
		this.booklist=booklist;
	}
	
	//method
	public void printBookList() {
		for(int i=0; i<booklist.length; i++) {
		    System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum=0;
		for(int k=0; k<booklist.length; k++) {
			sum += booklist[k].getPrice();
		}
		System.out.println(sum);		
	}
	
}

public class ProbEx04 {
	public static void main(String[] args) {
		Book[] booklist=new Book[5];
		
		Book book1=new Book("Java Program",25000);
		Book book2=new Book("JSP Program",15000);
		Book book3=new Book("SQL Fundamentals",30000);
		Book book4=new Book("JDBC Program",28000);
		Book book5=new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		
		booklist[0]=book1;
		booklist[1]=book2;
		booklist[2]=book3;
		booklist[3]=book4;
		booklist[4]=book5;
		
		BookMgr mgr=new BookMgr(booklist);
		
		System.out.println("===책 목록===");
		mgr.printBookList();
		System.out.println("");
		
		System.out.println("===책 가격의 총합===");
		mgr.printTotalPrice();
	}

}

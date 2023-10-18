package Com.Sunbeam;

import java.util.Scanner;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;
	public Book() {
		
			}
	public Book(String isbn, String title, String author, int quantity, double price) {
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void acceptbook() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the book id : ");
		isbn=sc.next();
		System.out.println("Enter the book title : ");
		title=sc.next();
		System.out.println("Enter the book author: ");
		author=sc.next();
		System.out.println("Enter the book quantity : ");
		price=sc.nextInt();
		System.out.println("Enter the book price: ");
		price=sc.nextDouble();
		
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj==null) 
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Book) {
			Book other = (Book)obj;
			if(this.isbn.equals(other.isbn))
				return true;
		}
		return false;
	
		
		
	}
	
	
	
	
	
	
	

}

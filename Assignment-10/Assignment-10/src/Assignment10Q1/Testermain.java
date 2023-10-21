package Assignment10Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testermain {
	
	
	public static int menu() {
		int choice;
		System.out.println("-------------------------------");
		
		System.out.println("1. Add new book");
		System.out.println("2. Display all books");
		System.out.println("3. Search for book with isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn ");
		System.out.println("6. Reverse the list");
		
		System.out.print("Enter Your Choice: \t");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------");
		return choice;
	}
		
	

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		List<Book> l1 = new ArrayList<>();
		Book b;
		int index;
		while(true)
		{
			int choice = menu();
			switch(choice)
			{
			case 1:
				b = new Book();
				b.acceptbook();
				l1.add(b);
//				if()
				
			}
		}
		
		 

	}

}

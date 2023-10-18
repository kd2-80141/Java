package Com.Sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TesterBook {
	
	public static int menu() {
		int choice;
		System.out.println("-------------------------------");
		
		System.out.println("1. Add new book");
		System.out.println("2. Display all books");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check for book with isbn");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books");
		System.out.println("7. Sort all books by price in desc order");
		System.out.print("Enter Your Choice: \t");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------");
		return choice;
	}
		


	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		List<Book>l1=new ArrayList<>();
	Book b1;
	int index;
	 while (true)
	 {
	
	
		int choice = menu();
		switch(choice)
		{
		case 1:
		b1=new Book();
			b1.acceptbook();
			l1.add(b1);
		   break;
		
		case 2:
			for(Book bk:l1)
				System.out.println(bk);
			break;
			
		case 3:
			System.out.println("Enter the index at wich elemnt to be deleted");
			  index=sc.nextInt();
			  l1.remove(index);
			  break;
			  
		case 4:
			String isbn;
			isbn=sc.next();
			Book key = new Book();
			key.setIsbn(isbn);
			if(l1.contains(key))
				System.out.println("Found");
			else
				System.out.println("Not Found");
			break;
			
		case 5:
			l1.clear();
			break;
		case 6:
			System.out.println("Size=" + l1.size());
			break;
		case 7:
			class BookPriceComparator implements Comparator<Book>
			{
					public int compare (Book b1, Book b2) {
					int diff = - Double.compare(b1.getPrice(),b2.getPrice()); 
					return diff;
					}
			}
					BookPriceComparator comparator = new BookPriceComparator();
				l1.sort(comparator);
				break;
					
				}//switch
		
			
		}
	}
}
	
	
		
	

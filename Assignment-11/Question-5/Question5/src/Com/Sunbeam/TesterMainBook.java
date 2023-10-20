package Com.Sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class TesterMainBook {
	
	
static public int menu() {
	Scanner sc = new Scanner(System.in);
	int choice;
	System.out.println("***************************");
	System.out.println("0.To Exit");
	System.out.println("1.Insert in map");
	System.out.println("2.To Find in map");
	System.out.print("Enter your choice...");
	choice=sc.nextInt();
	return choice;
	
            
	}


public static void main(String [] args) {
	int choice;
	
	Scanner sc = new Scanner(System.in);
	Map<String,Book>map = new HashMap<>();
	while((choice=menu())!= 0) {
		switch (choice) {
		
		case 1:
			Book b = new Book();
			b.acceptbook();
			map.put(b.getIsbn(),b);
			break;
			
		case 2:
			System.out.println("Enter the isbn number: ");
			String isbn  = sc.next();
			Book b1 = map.get(isbn);
			System.out.println(b1);
			break;
				
		}
		
	}
	
	
}

}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TesterMainStudent {
	
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


	public static void main(String[] args) {
		Map<Integer,Student>mp = new LinkedHashMap<>();
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		while((choice=menu())!= 0) {
			switch (choice) {
			
			case 1:
				 Student std = new Student();
				std.acceptStudent();
				mp.put(std.getRoll(),std);
				break;
				
			case 2:
				System.out.println("Enter the roll number: ");
				int roll  = sc.nextInt();
				Student s1 = mp.get(roll);
				System.out.println(s1);
				break;
					
			}
			
		}
		
		
	}
}



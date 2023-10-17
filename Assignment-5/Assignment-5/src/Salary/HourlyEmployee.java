package Salary;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	private int wage;
	private int hours;
	
	public HourlyEmployee() {
		
		
	}
	
		
	public HourlyEmployee(String firstName, String lastName, int ssn, int wage, int hours) {
		super(firstName, lastName, ssn);
		this.wage = wage;
		this.hours = hours;
	}


	
	
   void acceptdata() {
	   super.acceptdata();
	   
	   System.out.println("Enter the wage:");
	   wage=new Scanner(System.in).nextInt();
	   System.out.println("Enter the hours:");
	   hours=new Scanner(System.in).nextInt();
	   
	   
   }
   
   void displayemp() {
	   
	   System.out.println("The wage of yours is:"+ wage);
	   System.out.println("The no of hours you worked is :" + hours);
	   Salary();
   }
@Override
public void Salary() {
	     int total = 0;
               if (this.hours<=40)
            	     total = wage*hours;
               else if (this.hours>40)
               {
            	  total=(int) ( 40 * this.wage + (this.hours-40) * this.wage*1.5);
               }
              
            	   
     System.out.println("Your total wage is Rs." + total  );	
     
}


@Override
public String toString() {
	return " [wage=" + wage + ", hours=" + hours + " name="+ getFirstName()
			+ ", LastName()=" + getLastName() + ", Ssn()=" + getSsn();
}






  
}



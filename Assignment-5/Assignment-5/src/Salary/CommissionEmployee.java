package Salary;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
private double commissionRate;
private double grossSales;


	public CommissionEmployee() {
	
	
}



	
public CommissionEmployee(String firstName, String lastName, int ssn, double commissionRate, double grossSales) {
		super(firstName, lastName, ssn);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}






public void acceptdata() {
	super.acceptdata();
	System.out.println("Enter the commision rate:");
	this.commissionRate=new Scanner(System.in).nextDouble();
	System.out.println("Enter the gross sales:");
	this.grossSales=new Scanner(System.in).nextDouble();

}




	@Override
	public void Salary() {
		
	      double comm= this.commissionRate * this.grossSales;
	      System.out.println("Your Salary on commission is: "+comm);
		
	}




	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSsn()=" + getSsn();
	}
	
	

}

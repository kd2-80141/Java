package Salary;

import java.util.Scanner;

public class BaseandCommissionEmp  extends Employee{
	
  private int grossSales;
  private double commissionRate;
  private int baseSalary;
public BaseandCommissionEmp() {
	
	
}
public BaseandCommissionEmp(String firstName, String lastName, int ssn, int grossSales, double commissionRate,
		int baseSalary) {
	super(firstName, lastName, ssn);
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
	this.baseSalary = baseSalary;
}




public int getGrossSales() {
	return grossSales;
}
public void setGrossSales(int grossSales) {
	this.grossSales = grossSales;
}
public double getCommissionRate() {
	return commissionRate;
}
public void setCommissionRate(double commissionRate) {
	this.commissionRate = commissionRate;
}
public int getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(int baseSalary) {
	this.baseSalary = baseSalary;
	
	
}
void acceptdata() {
	     Scanner sc= new Scanner(System.in);
	     super.acceptdata();
	     System.out.print("Enter the gross Sales");
	     grossSales=sc.nextInt();
	     System.out.print("Enter the Commission Rate:");
	     commissionRate=sc.nextDouble();
	     System.out.print("Enter the Base Salary");
	     baseSalary=sc.nextInt();
}  

void displayBaseCommission() {
	
	System.out.print("Your Gross sales are:" + grossSales);
	System.out.print("Your Commission Rate are:" + commissionRate);
	System.out.print("Your Base Salary is:" + baseSalary);
	System.out.println("Your total Salary is: ");
	Salary();
}
	     

@Override
public void Salary() {
	int tot=0;
	
	 tot= (int) ((commissionRate * grossSales) + baseSalary);
	 
	  System.out.println("Your Salary on commission is: "+tot);
	  
	 double percentincrease=(tot+(0.1*tot));
	 
	 System.out.println("Congrats you got 10% hike: " +percentincrease );
	
}
@Override
public String toString() {
	return "BaseandCommissionEmp [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", baseSalary="
			+ baseSalary + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getSsn()="
			+ getSsn();
}




  
  

}

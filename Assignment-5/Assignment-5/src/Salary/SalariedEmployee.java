package Salary;

import java.util.Scanner;

 class SalariedEmployee extends Employee{
 double weeklySalary;

public SalariedEmployee() {
	
	}


public SalariedEmployee(String firstName, String lastName, int ssn, double weeklySalary) {
	super(firstName, lastName, ssn);
	this.weeklySalary = weeklySalary;
}




public double getWeeklySalary() {
	return weeklySalary;
}

public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}

public void acceptdata() {
	Scanner sc = new Scanner(System.in);
	super.acceptdata();
	System.out.println("Enter your weekly Salary");
	weeklySalary = sc.nextDouble();
	

	
}


@Override
public void Salary() {
	
	System.out.println("Weekly Salary:"+this.weeklySalary);
}
}



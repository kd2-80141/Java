package Salary;

import java.util.Scanner;

public abstract class Employee {
private String firstName;
private String lastName;
private int ssn;

public Employee() {
	
	}
public Employee(String firstName, String lastName, int ssn) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.ssn = ssn;
}

abstract public void Salary ();

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
}

void acceptdata() {
	Scanner sc = new Scanner(System.in );
	System.out.print("Enter your first name: ");
	firstName=sc.next();
	System.out.print("Enter your lastName: ");
	lastName=sc.next();
	System.out.println("Enter the Social security number: ");
	ssn=sc.nextInt();
	
	
}
}







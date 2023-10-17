package com.invoice.entity;

import java.util.Scanner;





/*
 * Q3. Create an application that calculates your daily driving cost, so that
 * you can estimate how much money could be saved by car pooling, which also has
 * other advantages such as reducing carbon emissions and reducing traffic
 * congestion. The application should input the following information and
 * display the user’s cost per day of driving to work: a) Total miles driven per
 * day. b) Cost per gallon of gasoline. c) Average miles per gallon. d) Parking
 * fees per day. e) Tolls per day.
 */

public class Invoice {
	int milesperday;
	double costpergallon;
	double Average;
	int parkingfees;
	int tollsperday;
	int noofpassenger;

	public Invoice() {
		this.milesperday = 0;
		this.costpergallon = 0;
		this.Average = 0;
		this.parkingfees = 0;
		this.tollsperday = 0;
		this.noofpassenger = 0;

	}

	public Invoice(int milesperday, double costpergallon, double average, int parkingfees, int tollsperday,
			int noofpassenger) {

		this.milesperday = milesperday;
		this.costpergallon = costpergallon;
		this.Average = average;
		this.parkingfees = parkingfees;
		this.tollsperday = tollsperday;
		this.noofpassenger = noofpassenger;
	}

	public void acceptdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Miles you drive per day: ");
		milesperday = sc.nextInt();
		System.out.print("Enter the Cost per gallon fuel : ");
		costpergallon = sc.nextInt();
		System.out.print("Enter the Average of your vehical : ");
		Average = sc.nextInt();
		System.out.print("Enter the parking fees: ");
		parkingfees = sc.nextInt();
		System.out.print("Enter the tolls per day: ");
		tollsperday = sc.nextInt();
		System.out.print("Enter the no of passenger that will travel with you");
		noofpassenger=sc.nextInt();
		if(noofpassenger==0)
			noofpassenger=1;

	}

	public void displaydata() {
		System.out.println("The Miles you drive per day is: " + milesperday);
		System.out.println("The Cost per gallon fuel is : " + costpergallon);
		System.out.println("The Average of your vehical is : " + Average);
		System.out.println("The Parking fess for your vehical will be: " + parkingfees);
        System.out.println("Your tolls per day are : " + tollsperday);
		System.out.println("No of passenger traveling with you are: " + noofpassenger);

	}

	public void Calculations() {
		double totexp = (milesperday / Average) * costpergallon+parkingfees;
		System.out.println("Your Total Cost is  Rs." + totexp);
		System.out.println("**********************************************************");
		System.out.println("The money you will save after car pooling is Rs. :" + (totexp - (totexp / noofpassenger)));
	}

}

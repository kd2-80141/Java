package com.sunbeam;

import java.util.Scanner;

interface Arithmetic {
	double calc(double num1, double num2);

}
public class Main  {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		int choice;
		
	  do {
				System.out.println("0. to Exit");
				System.out.println("1.to Add");
				System.out.println("2. to Subtract");
				System.out.println("3. to Multiply");
				System.out.println("4. to Divide");
				System.out.println("Enter your choice");
				Scanner sc= new Scanner(System.in);
				choice = sc.nextInt();
				
				switch (choice) {
				case 1: //add
					System.out.print("Enter the 1st number:");
					double num1=sc.nextDouble();
					System.out.print("Enter the 2nd number:");
					double num2=sc.nextDouble();
					calculate(num1,num2,(x,y)->x+y);
					break;
					
					
				case 2: //sub
					System.out.print("Enter the 3rd number:");
					double num3=sc.nextDouble();
					System.out.print("Enter the 4th number:");
					double num4=sc.nextDouble();
					calculate(num3,num4,(x,y)->x-y);
					break;
					
				case 3: //multiply
					System.out.print("Enter the 5th number:");
					double num5=sc.nextDouble();
					System.out.print("Enter the 6th number:");
					double num6=sc.nextDouble();
					calculate(num5,num6,(x,y)->x*y);
					break;
					
				case 4: //divide
					System.out.print("Enter the 7th number:");
					double num7=sc.nextDouble();
					System.out.print("Enter the 8th number:");
					double num8=sc.nextDouble();
					calculate(num7,num8,(x,y)->x/y);
					break;

				default:
					break;
				}

		  
	  }while(choice!=0);	
		

	}

}


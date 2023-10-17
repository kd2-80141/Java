/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/

public class CreditLimitCalculator {
	int accountno;
	   int beginingbalance;
	   int charges;
	   int credits;
	   int allowedcredits;
	   int newbalance;                               	   
	   
	   
	   public CreditLimitCalculator() {
		
	}

	public CreditLimitCalculator(int accountno, int beginingbalance, int charges, int credits, int allowedcredits
			) {
		
		this.accountno = accountno;
		this.beginingbalance = beginingbalance;
		this.charges = charges;
		this.credits = credits;
		this.allowedcredits = allowedcredits;
		
		
	}
	
	void CalculateNewBalance() {
		
		
		this.newbalance = beginingbalance + charges - credits;
		System.out.println("Your new balance is Rs. " +  newbalance);
		
		if( newbalance<allowedcredits) {
			System.out.println("Your final balance is Rs. " + newbalance);
		}
			else
				System.out.println("Credit Limit Exceeded...");
		}
	}
	   
	   
	   
	
	    
	



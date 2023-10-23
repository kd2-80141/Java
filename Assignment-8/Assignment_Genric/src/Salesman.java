import java.util.Scanner;

public class Salesman extends Employee
{
 float comm;

public Salesman() {
	super();
	
}

public Salesman(int id, float sal, float comm) {
	super(id, sal); 
	      this.comm=comm;
}

public float getComm() {
	return comm;
}

public void setComm(float comm) {
	this.comm = comm;
}

void accept()
    {
	Scanner sc = new Scanner(System.in);
	super.accept();
	System.out.println("Enter the commission ");
    comm = sc.nextFloat();        
        
    }

public  double TotalSalary() {
	   System.out.println("Your total salary is : Rs." + (this.sal + this.comm));
	return sal;
	   
   }

    void display()
    {
       super.display();
      System.out.println("Your commission is: " + comm);
    }
}


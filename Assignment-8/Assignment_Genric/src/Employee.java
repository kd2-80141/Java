import java.util.Scanner;

abstract class Employee
{
private int id;
protected float sal;    

public Employee() {
	
	   this.id=0;
	   this.sal=0;
}
 
public Employee(int id , float sal) {
	this.id=id;
	this.sal=sal;
	
}  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public float getSal() {
	return sal;
}

public void setSal(float sal) {
	this.sal = sal;
}

	void accept() {
	Scanner sc= new Scanner(System.in);
    
        System.out.println("Enter the EmpId:"); 
        id=sc.nextInt();
        
        System.out.println("Enter the Salary:"); 
        sal = sc.nextFloat();
    }
	
	
	abstract public double TotalSalary(); 
	
	    
	 
    void display()
    {
    	System.out.println( "Id is: "+ this.id);
    	System.out.println("Your Total Salary is: Rs. " + this.sal);    

    }
    
   
    }



	



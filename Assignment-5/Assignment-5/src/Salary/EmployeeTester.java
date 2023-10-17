package Salary;

public class EmployeeTester {

	public static void main(String[] args) {
		
//Commission Employee Class object
		 Employee emp = new CommissionEmployee();
		 emp.acceptdata();
		 emp.Salary();
		 System.out.println(emp);
		 System.out.println("*************************************************");
		
		
		
//Hourly Employee Class object
		Employee he = new HourlyEmployee();
				 he.acceptdata();
		         he.Salary();
		         System.out.println(he);
		         System.out.println("*************************************************");         
		         
//Salaried Employee Class Object
		    Employee se=new SalariedEmployee();
		    se.acceptdata();
		    se.Salary();
		    System.out.println(se);
		    System.out.println("*************************************************");
// BaseandCommission Class Object
		    Employee bc=new BaseandCommissionEmp();
		    bc.acceptdata();
		    bc.Salary();
		    System.out.println(bc);
		    System.out.println("*************************************************");  
		 
		 
		
	}

}

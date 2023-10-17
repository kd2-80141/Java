/*Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/


public class Employee {
     private
    	 String firstname;
        String lastname;
        double monthly_salary;
		public Employee(String firstname, String lastname, double monthly_salary) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.monthly_salary = monthly_salary;
		}
		public Employee() {
			
			
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public double getMonthly_salary() {
			return monthly_salary;
		}
		public void setMonthly_salary(double monthly_salary) {
			if(monthly_salary < 0)
				this.monthly_salary=0;
			else
			this.monthly_salary = monthly_salary;
		}
		
		void DisplaySalary() {
			System.out.println("First name = "+ firstname);
			System.out.println("Last name = "+ lastname);
			System.out.println("Annual salary = "+ monthly_salary*12 );
		
		}
		
		void IncrementSalary() {
			
			System.out.println("First name = "+ firstname);
			System.out.println("Last name = "+ lastname);
			System.out.println("You got a 10% increment :)");
			System.out.println("Increment annual salary = " + (monthly_salary+ monthly_salary* 0.1 )*12);
		
		}
		
            
        
        
        
        
      
        
     
}

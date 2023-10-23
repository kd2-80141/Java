import java.util.Scanner;

public class Manager extends Employee{
	
	private float bonus; 
	
      public Manager() {
		super();
	}

	public Manager(int id, float sal, float bonus) {
		super(id, sal);
		   this.bonus=bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

		public void accept()
	    {
			 Scanner sc = new Scanner(System.in);
            super.accept();
	     
	     System.out.println("Enter Bonus: ");
	        bonus=sc.nextFloat();
	    }

	    public void display()
	    {
            super.display();
	      
	      System.out.println("Your bonus is: " + this.bonus); 
	      
	    }
	    
	    public double TotalSalary() {
	    	   System.out.println("Your total Salary is: Rs." +(this.bonus + this.sal));
			return sal;
	   
	    }

	
}

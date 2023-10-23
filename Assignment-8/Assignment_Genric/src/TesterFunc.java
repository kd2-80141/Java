
public class TesterFunc {

	public static void main(String[] args) {
//		    Salesman s1 = new Salesman();
//		    s1.accept();
//		    s1.TotalSalary();
//		    s1.display();
//		    
//		    Manager m1= new Manager();
//		   
//		   
//		    m1.accept();
//		    m1.TotalSalary();
//		    m1.display();
		    
		    Salesman s0= new Salesman();
		    s0.accept();
		    s0.display();
		    s0.TotalSalary();
		    
		    Box<Salesman>b1=new Box<>();
		    b1.set(s0);
		    System.out.println(b1.getTotalSalary());
		    

	}

}

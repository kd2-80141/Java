
public interface Emp {
	double getSal();
	default double calcIncentives() 
	{
		return 0.0;
	}
	static double calcTotalIncome(Emp[]arr) 
	{
		return 0;
		
	} 
		
		for(Emp e:arr) {
			double total += e.getSal()+e.calcIncentives();
			return total;
		}
			
		 
		 
		
	}

}

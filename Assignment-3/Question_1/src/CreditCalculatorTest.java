
public class CreditCalculatorTest {

	public static void main(String[] args) {
		CreditLimitCalculator clc = new CreditLimitCalculator(2061,2000,1450,1360,1000);
		clc.CalculateNewBalance();
		
		System.out.println("************************************************************");
		
		CreditLimitCalculator clc1 =  new CreditLimitCalculator(3061,900,600,1000,850);
		clc1.CalculateNewBalance();

	}
}



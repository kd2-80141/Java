import java.util.Iterator;

public class Q4_Q2Assignment1 {

	public static void main(String[] args) {
	   int n=5;
       for (int i = n; i >=0; i++) 
       {
		for (int k = 0; k <=n-i+1; k++) {
			System.out.print(" ");
			
		}
		for (int j = 1; j <=i ; j++) {
			System.out.print("*");
	
		}
		System.out.println();
	}

	}

}

/*Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.*/




package Com.Sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookMainTester {

	public static void main(String[] args) {
	         Set<Books>st = new HashSet<>(); 
	         st.add(new Books("1001", "Two States" , "Chetan Bhagat" , 2 ,350 ));
	         st.add(new Books("1212", "Murder on the Orient Express" , "Agatha Kristie" , 1 ,250 ));
	         st.add(new Books("1021", "The Monk who sold his Ferrari" , "Robin Sharma" , 3 ,400 ));
	         st.add(new Books("1131", "Harry Potter" , "J.K.Rowling" , 4 ,550 ));
	         st.add(new Books("1337", "Naruto" , "Masashi Kishimoto" , 10 ,720 ));
	         st.add(new Books("1337", "Fairy Tale" , "Random" , 5,450 ));      /*when we add duplicate value as isbn in output it is accepting the duplicate entry,
	                                                                               To avoid this issue we have to write hashcode and equals method.*/
	         
	         
	         
	         
	       Iterator<Books>itr = st.iterator();
	       while(itr.hasNext()) {
	    	   Books bk = itr.next();                                   /*Book are Sorted according to HashSet order but output we see in random.*/
	    	   System.out.println(bk);
	       }
	       
	}
          
	
}

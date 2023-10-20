/*In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?*/

package Com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesterBook {

	public static void main(String[] args) {
	 
		Set<Book>st = new TreeSet<>(); 
        st.add(new Book("1001", "Two States" , "Chetan Bhagat" , 2,350 ));
        st.add(new Book("1212", "Murder on the Orient Express" , "Agatha Kristie" , 1 ,250 ));
        st.add(new Book("1021", "The Monk who sold his Ferrari" , "Robin Sharma" , 3 ,400 ));
        st.add(new Book("1131", "Harry Potter" , "J.K.Rowling" , 4 ,550 ));
        st.add(new Book("1337", "Naruto" , "Masashi Kishimoto" , 10 ,720 ));
        st.add(new Book("1337", "Fairy Tale" , "Random" , 5,450 ));
        
                                                        /*when we add duplicate value as isbn in output it is accepting the duplicate entry,
                                                                              To avoid this issue we have to write hashcode and equals method.*/
                     
               Iterator <Book> etr = st.iterator();
               while(etr.hasNext()) {
            	   Book bk = etr.next();                    /*when we add duplicate value as isbn in output it is accepting the duplicate entry...*/
                   System.out.println(bk);
               }
               
	}

}





/*2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?*/
package Ass11Q2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesterBook {

	public static void main(String[] args) {
		
		Set<Book>st = new LinkedHashSet<>(); 
        st.add(new Book("1001", "Two States" , "Chetan Bhagat" , 2 ,350 ));
        st.add(new Book("1212", "Murder on the Orient Express" , "Agatha Kristie" , 1 ,250 ));
        st.add(new Book("1021", "The Monk who sold his Ferrari" , "Robin Sharma" , 3 ,400 ));
        st.add(new Book("1131", "Harry Potter" , "J.K.Rowling" , 4 ,550 ));
        st.add(new Book("1337", "Naruto" , "Masashi Kishimoto" , 10 ,720 ));
        st.add(new Book("1337", "Fairy Tale" , "Random" , 5,450 ));
        
        
        Iterator <Book> itr= st.iterator();
        while(itr.hasNext()) {
            Book bk=itr.next();
            System.out.println(bk);                                    /*when we add duplicate value as isbn in output it is accepting the duplicate entry,
                                                                       To avoid this issue we have to write hashcode and equals method.*/
        }
        
        
        
        
	}

}

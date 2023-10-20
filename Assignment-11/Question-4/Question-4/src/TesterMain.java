import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/*Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().*/
public class TesterMain {
	
	static class BookComparator implements Comparator <Book>{

		@Override
		public int compare(Book b1, Book b2) {
			 int  diff = -Double.compare(b1.getPrice(),b2.getPrice());
			
			return diff;
		}
		
	}

	public static void main(String[] args) {
	
		
		
		NavigableSet<Book>st=new TreeSet<>(new BookComparator());
		 st.add(new Book("1001", "Two States" , "Chetan Bhagat" , 2,350 ));
	        st.add(new Book("1212", "Murder on the Orient Express" , "Agatha Kristie" , 1 ,250 ));
	        st.add(new Book("1021", "The Monk who sold his Ferrari" , "Robin Sharma" , 3 ,400 ));
	        st.add(new Book("1131", "Harry Potter" , "J.K.Rowling" , 4 ,550 ));
	        st.add(new Book("1337", "Naruto" , "Masashi Kishimoto" , 10 ,720 ));
	        st.add(new Book("1337", "Fairy Tale" , "Random" , 5,720 ));
	        
          
	        Iterator <Book> etr = st.iterator();
	        while(etr.hasNext()) {
	        Book bk = etr.next();
	        System.out.println(bk);
	        }
	        System.out.println();
	        
	        Iterator<Book> itr =  st.descendingIterator();
	        while(itr.hasNext()) {
	        Book bk1= itr.next();
	        System.out.println(bk1);
	        }

	}

}

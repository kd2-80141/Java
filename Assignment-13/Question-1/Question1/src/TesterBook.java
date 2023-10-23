import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Q11. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream.*/

public class TesterBook {

	public static int menu() {
		int choice;
		System.out.println("-------------------------------");
		System.out.println("0.To Exit");
		System.out.println("1. Add new book");
		System.out.println("2. Display all books");
		System.out.println("3. Search for book with isbn");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Delete a book with given isbn ");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save books in file");
		System.out.println("8. Load books from file");

		System.out.print("Enter Your Choice: \t");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		int choice;

		List<Book> l1 = new ArrayList<>();
		l1.add(new Book("1001", "Two States", "Chetan Bhagat", 2, 350));
		l1.add(new Book("1212", "Murder on the Orient Express", "Agatha Kristie", 1, 250));
		l1.add(new Book("1021", "The Monk who sold his Ferrari", "Robin Sharma", 3, 400));
		l1.add(new Book("1131", "Harry Potter", "J.K.Rowling", 4, 550));
		l1.add(new Book("1337", "Naruto", "Masashi Kishimoto", 10, 720));
		l1.add(new Book("1337", "Fairy Tale", "Random", 5, 450));

		List<Book> arr = new ArrayList<>();

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.print("Enter Isbn : ");
				String isbn = new Scanner(System.in).next();
				System.out.print("Enter price : ");
				int price = new Scanner(System.in).nextInt();
				System.out.print("Enter Author : ");
				String author = new Scanner(System.in).next();
				System.out.print("Enter Quantity : ");
				Double qty = new Scanner(System.in).nextDouble();

				Book key = new Book(isbn, author, " ", price, qty);

				if (arr.contains(key)) {
					int i = arr.indexOf(key);
					Book b = arr.get(i);
					b.setQuantity(b.getQuantity() + 1);
				} else
					arr.add(key);
				break;

			case 2:
				Collections.shuffle(arr);
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					System.out.println(b1);
				}
				break;

			case 3:
				System.out.print("Enter Isbn : ");
				isbn = new Scanner(System.in).next();
				Book key1 = new Book();
				if (arr.contains(key1)) {
					int index = arr.indexOf(key1);
					Book b2 = arr.get(index);
					System.out.println(b2);
				}

				break;

			case 4:
				System.out.println("Enter the index : ");
				int index = new Scanner(System.in).nextInt();
				arr.remove(index);
				System.out.println("The Element at the index " + index + " deleted!!");
				break;

			case 5:
				System.out.print("Enter Isbn : ");
				isbn = new Scanner(System.in).next();
				Book key2 = new Book();
				if (arr.contains(key2)) {
					int index1 = arr.indexOf(key2);
					arr.remove(index1);
					System.out.println("The Book with Isbn :  " + isbn + " deleted!!");
				}
				break;

			case 6:
				Collections.reverse(arr);
				System.out.println("Reveresed List: " + arr);
				Collections.reverse(arr);
				break;

			case 7:
				try (FileOutputStream fout = new FileOutputStream("Book.txt")) {
					try (DataOutputStream dout = new DataOutputStream(fout)) {
						for (Book b : l1) {
							dout.writeUTF(b.getIsbn());
							dout.writeUTF(b.getTitle());
							dout.writeUTF(b.getAuthor());
							dout.writeInt(b.getQuantity());
							dout.writeDouble(b.getPrice());
						}

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books Saved");

			case 8:
				try (FileInputStream fin = new FileInputStream("Book.txt")) {
					try (DataInputStream din = new DataInputStream(fin)) {
						while (true) {
							Book b1 = new Book();
							b1.setIsbn(din.readUTF());
							b1.setTitle(din.readUTF());
							b1.setAuthor(din.readUTF());
							b1.setQuantity(din.readInt());
							b1.setPrice(din.readDouble());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			default:
				System.out.println("Invalid Choice....Try Again!!");
				break;
			}

			System.out.println("Thank you for using the application!!");

		}
	}
}

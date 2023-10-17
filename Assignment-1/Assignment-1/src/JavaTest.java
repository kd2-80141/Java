import java.util.Scanner;

/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/

public class JavaTest {
         public static void main(String[] args) {
        	 Scanner sc= new Scanner(System.in);
        	 int num;
        	 System.out.println("Enter the num to be checked: ");
        	 num=sc.nextInt();
        	 System.out.println("The number you entered is: " + num);
        	 System.out.println("The Binary Equivalent is: " + Integer.toBinaryString(num));
        	 System.out.println("The Octal Equivalent is: " + Integer.toOctalString(num));
        	 System.out.println("The Hexadecimal Equivalent is: " + Integer.toHexString(num));
        	 
         }
}

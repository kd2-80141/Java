import java.util.Scanner;

/*Q3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.*/

public class Q3Assignment1 {

	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0. To EXIT ");
		System.out.println("1. To Add Dosa: ");
		System.out.println("2. To Add Samosa: ");
		System.out.println("3. To Add Idli: ");
		System.out.println("4. To Add Poha: ");
		System.out.println("5. To Add Upma: ");
		System.out.println("6. To Add Water Bottle: ");
		System.out.println("7. To Add Chai: ");
		System.out.println("8. To Add Thali ");
		System.out.println("9. To Add Pav Bhaji: ");
		System.out.println("10. To Add coffee: ");
		System.out.println("11. To Generate Bill: ");
		System.out.println("*************************");
		System.out.println("Enter your choice: ");
		System.out.println("*************************");
		choice = sc.nextInt();
		System.out.println("*************************");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		int Total = 0;
		int flag = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {

			case 1: {
				int q1;
				int Dosa = 70;
				System.out.print("Enter the Quantity of Dosa You need...");
				q1 = sc.nextInt();
				System.out.println(q1 + "-" + " Dosa ADDED... :)");
				Total += q1 * Dosa;
			}
				break;

			case 2: {
				int q2;
				int samosa = 10;
				System.out.print("Enter the Quantity of Samosa You need...");
				q2 = sc.nextInt();
				System.out.println(q2 + "-" + " Samosa ADDED... :)");
				Total += q2 * samosa;
			}
				break;

			case 3: {
				int q3;
				int Idli = 25;
				System.out.print("Enter the Quantity of Idli You need...");
				q3 = sc.nextInt();
				System.out.println(q3 + "-" + " Idli ADDED... :)");
				Total += q3 * Idli;
			}
				break;

			case 4: {
				int q4;
				int Poha = 10;
				System.out.print("Enter the Quantity of Poha You need...");
				q4 = sc.nextInt();
				System.out.println(q4 + "-" + " Poha ADDED... :)");
				Total += q4 * Poha;
			}
				break;
			case 5: {
				int q5;
				int Upma = 15;
				System.out.print("Enter the Quantity of Upma You need...");
				q5 = sc.nextInt();
				System.out.println(q5 + "-" + " Upma ADDED... :)");
				Total += q5 * Upma;
			}
				break;

			case 6: {
				int q6;
				int WaterBottle = 20;
				System.out.print("Enter the Quantity of WaterBottle You need...");
				q6 = sc.nextInt();
				System.out.println(q6 + "-" + " WaterBottle ADDED... :)");
				Total += q6 * WaterBottle;
			}
				break;

			case 7: {
				int q7;
				int Chai = 10;
				System.out.print("Enter the Quantity of Chai You need...");
				q7 = sc.nextInt();
				System.out.println(q7 + "-" + " Chai ADDED... :)");
				Total += q7 * Chai;
			}
				break;

			case 8: {
				int q8;
				int Thali = 300;
				System.out.print("Enter the Quantity of Thali You need...");
				q8 = sc.nextInt();
				System.out.println(q8 + "-" + " Thali ADDED... :)");
				Total += q8 * Thali;
			}
				break;

			case 9: {
				int q9;
				int Pavbhaji = 70;
				System.out.print("Enter the Quantity of PavBhaji You need...");
				q9 = sc.nextInt();
				System.out.println(q9 + "-" + " PavBhaji ADDED... :)");
				Total += q9 * Pavbhaji;
			}
				break;

			case 10: {
				int q10;
				int Coffee = 20;
				System.out.print("Enter the Quantity of coffee You need...");
				q10 = sc.nextInt();
				System.out.println(q10 + "-" + " coffee ADDED... :)");
				Total += q10 * Coffee;
			}
				break;
			case 11: {
				int GenrateBill;
				GenrateBill = Total;
				System.out.println("Your Total Bill is:" + "Rs." + GenrateBill);

				flag = 1;
			}
				break;

			default: {
				System.out.println("Invalid Input...Please enter valid input");
			}
				break;

			}
			if (flag == 1) {
				break;
			}
			System.out.println("***************************************");
			System.out.println("Thank You... Visit Again Please");

		}
	}
}

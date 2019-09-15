import java.text.DecimalFormat;
import java.util.Scanner;

/* This app is designed to calculate change to return to customer as well as remaining
 * balance if needed. There is a lot that can be done to advance this program, but with time.
 * ...and a bit more learning :)
 */

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		welcome(); // calls the welcome message

		System.out.print("Enter the purchase price: $ "); // calls for price
		double price = kb.nextDouble(); // accepts decimal.
		double total = price;
		DecimalFormat df = new DecimalFormat("#,###.00"); // formats my decimal to two places and allows for commas

		System.out.print("Enter your payment amount: $ "); // renders payment amount
		double payment = kb.nextDouble();
		System.out.println();
		kb.close();

		double changeDue = payment - total; // calculates difference
		double change = changeDue * 100;

		int bill50 = (int) (change / 5000); // $50 bill
		change = change % 5000;

		int bill20 = (int) (change / 2000); // $20 bill
		change = change % 2000;

		int bill10 = (int) (change / 1000); // $10 bill
		change = change % 1000;

		int bill5 = (int) (change / 500); // $5 bill
		change = change % 500;

		int bill1 = (int) (change / 100); // $1 bill
		change = change % 100;

		int quarters = (int) (change / 25); // $0.25 cents
		change = change % 25;

		int dimes = (int) (change / 10); // $0.10 cents
		change = change % 10;

		int nickels = (int) (change / 5); // $0.05 cents
		change = change % 5;

		// System.out.println("This is a temporary line to check change " + change);
		int pennies = (int) ((change / 1) + 0.001); // $0.01 cents
		change = change % 1;

		if (changeDue > 0) {
			System.out.println("Thank you for your payment!");
			System.out.println("**********************************************************\n");
			System.out.println("Total Change: $ " + df.format(changeDue));
			System.out.println();
			System.out.println("Give back: " + bill50 + " <--> fifty dollar bill(s)\n");
			System.out.println("Give back: " + bill20 + " <--> twenty dollar bill(s)\n");
			System.out.println("Give back: " + bill10 + " <--> ten dollar bill(s)\n");
			System.out.println("Give back: " + bill5 + " <--> five dollar bill(s)\n");
			System.out.println("Give back: " + bill1 + " <--> one dollar bill(s)\n");
			System.out.println("Give back: " + quarters + " <--> quarter(s)\n");
			System.out.println("Give back: " + dimes + " <--> dime(s)\n");
			System.out.println("Give back: " + nickels + " <--> nickel(s)\n");
			System.out.println("Give back: " + pennies + " <--> penny(s)\n");
			System.out.println("**********************************************************");
			System.out.println();

		} else if (changeDue == 0) {
			System.out.println("Exact Payment...No Change Due");
			System.out.println("Thank you for your payment!");

		} else if (changeDue < 0) {
			double totalRemaining = changeDue;
			System.err.println("ERROR...Not enough money. Please provide remaing change due");
			System.out.println();
			System.out.println("**********************************************************\n");
			System.out.println("Money still owed: $ " + df.format(Math.abs(totalRemaining)));
		}
	}
	public static void welcome() {
		System.out.println("**********************************************************\n");
		System.out.println("                         Hello!           \n");
		System.out.println("              Welcome to \"Java Jerry's\".\n");
		System.out.println("We don't just sell coffee ;) but lots of ones and zeros!\n");
		System.out.println("**********************************************************\n");
	}
}

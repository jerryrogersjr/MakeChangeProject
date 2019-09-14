import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/* This app is designed to calculate change to return to customer as well as remaining
 * balance if needed. There is a lot that can be done to advance this program, but with time.
 * 
 */

public class MakeChangeApp {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("**********************************************************\n");
		System.out.println("                         Hello!           \n");
		System.out.println("              Welcome to \"Java Jerry's\".\n");
		System.out.println("We don't just sell coffee ;) but lots of ones and zeros!\n");
		System.out.println("**********************************************************\n");

		System.out.print("Enter the purchase price: $ ");
		double price = kb.nextDouble(); // accepts decimal.
		double total = price;
//		double tax = price * 0.085; // at 8.5% sales tax.
//		double total = price + tax;
		DecimalFormat df = new DecimalFormat("#,###.00"); // the #
//		df.setRoundingMode(RoundingMode.DOWN); // added this to fix my rounding issues on pennies.
//		System.out.println("Total with tax = $ " + df.format(total)); //

		System.out.print("Enter your payment amount: $ ");
		double payment = kb.nextDouble(); // accepts decimal.
		System.out.println();
		kb.close(); // scanner closed. not more input required.

		if (payment > total) {
			System.out.println("Thank you for your payment!");
		}

		double changeDue = payment - total; // calculates the difference.
		double totalChangeDue = changeDue; // declares the total due.
		double change = changeDue * 100; //

		change = change / 100; //
		change = change % 100; //

		// int bill100 = (int) (change / 100);
		// change = change % 100;

		int bill50 = (int) (change / 50); // $50 bill
		change = change % 50;

		int bill20 = (int) (change / 20); // $20 bill
		change = change % 20;

		int bill10 = (int) (change / 10); // $10 bill
		change = change % 10;

		int bill5 = (int) (change / 5); // $5 bill
		change = change % 5;

		int bill1 = (int) (change / 1); // $1 bill
		change = change % 1;

		int quarters = (int) (change / .25); // $0.25 cents
		change = change % .25;

		int dimes = (int) (change / .10); // $0.10 cents
		change = change % .10;

		int nickels = (int) (change / .05); // $0.05 cents
		change = change % .05;

		int pennies =  (int) ((change / .01) + 0.00000000000000001); // $0.01 cents 
		change = change % .01;
		change = change * 100;
		
		if (totalChangeDue > 0) {
			System.out.println("**********************************************************\n");
			System.out.println("Total Change: $ " + /*df.format(totalChangeDue) +*/ "\t(" + totalChangeDue + ")");
			System.out.println();
			// System.out.println("Give back: " + bill100 + " <--> one hundred dollar
			// bill(s)\n");
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
		} else if (totalChangeDue < 0) {
			double totalRemaining = totalChangeDue;
			// Math.abs(value) is returning the negative to a positive for my print
			// statement.
			System.err.println("ERROR...Not enough money. Please provide remaing change due");
			System.out.println("**********************************************************\n");
			System.out.println("Money still owed: $ " + df.format(Math.abs(totalRemaining)) + "\t(" + totalChangeDue + ")");
			System.out.println();
			// System.out.println("They owe: " + Math.abs(bill100) + " <--> one hundred
			// dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(bill50) + " <--> fifty dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(bill20) + " <--> twenty dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(bill10) + " <--> ten dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(bill5) + " <--> five dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(bill1) + " <--> one dollar bill(s)\n");
			System.out.println("They owe: " + Math.abs(quarters) + " <--> quarter(s)\n");
			System.out.println("They owe: " + Math.abs(dimes) + " <--> dime(s)\n");
			System.out.println("They owe: " + Math.abs(nickels) + " <--> nickel(s)\n");
			System.out.println("They owe: " + Math.abs(pennies) + " <--> penny(s)\n");
			System.out.println("**********************************************************");
		}

	}

}
// change = (change < 0 ? -change : change);

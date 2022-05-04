package korMar;

import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {

		Long bill10;
		Long money;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a money as Long: ");

		money = keyboard.nextLong();

		// Calculation
		bill10 = money / 10;
		money = money % 10;

		// switch money to int for switch case

		String change = "" + money;
		int m = Integer.parseInt(change);

		switch (m) {
		case 1:
			moneyNotChangable();
			break;
		case 2:
			System.out.println("you get: " + bill10 + " 10€ bills and one 2€ coin");
			break;
		case 3:
			moneyNotChangable();
			break;
		case 4:
			System.out.println("you get: " + bill10 + " 10€ bills and two 2€ coins");
			break;
		case 5:
			System.out.println("you get: " + bill10 + " 10€ bills and one 5€ bill");
			break;
		case 6:
			System.out.println("you get: " + bill10 + " 10€ bills and three 2€ coins");
			break;
		case 7:
			System.out.println("you get: " + bill10 + " 10€ bills, one 5€ bill and one 2€ coin");
			break;
		case 8:
			System.out.println("you get: " + bill10 + " 10€ bills and four 2€ coins");
			break;
		case 9:
			System.out.println("you get: " + bill10 + " 10€ bills, one 5€ bill and two 2€ coin");
			break;
		case 0:
			System.out.println("you get: " + bill10 + " 10€ bills");
			break;
		}

		keyboard.close();
	}

	private static void moneyNotChangable() {
		System.out.println("The enteret amont cannot be changed into 2€ coins 5€ bills and 10€ bills");
	}

}

package learning.basic;

public class operatorClass {
	public static void main(String[] args) {
		/*
		 * int age = 22; if (age >= 18) { System.out.println("adult:drive,vote"); } else
		 * { System.out.println("not adult"); }
		 */

		/*
		 * int a = 1, b = 3; if (a >= b) { System.out.println("a is greater than 2"); }
		 * else { System.out.println("b is largest of 2"); }
		 */

		/*
		 * int a = 3; if (a % 2 == 0) { System.out.println("a is even"); } else {
		 * System.out.println("a is odd"); }
		 */

		/*
		 * // int income = 23456, tax = 0; // if (income < 500000) { // tax = income *
		 * 0; // System.out.println("TAX is :" + tax); // } else if (income >= 500000 &&
		 * income < 1000000) { // tax = (int) (income * 0.2); //
		 * System.out.println("tax is :" + tax); // } else { // tax = (int) (income *
		 * .3); // System.out.println("tax is :" + tax); // }
		 */
		int n = 2;
		switch (n) {
		case 1:
			System.out.println("Samosa");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Mango shake");
			break;

		default:
			System.out.println("We wake up");
			break;
		}

	}
}

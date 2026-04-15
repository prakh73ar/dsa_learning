package learning.practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Qu 1. Positive or Negative
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); if (n >= 0) {
		 * System.out.println(n + " is Positive"); } else { System.out.println(n +
		 * " is Negative"); }
		 */

		// QU 2. Check Fever
		/*
		 * double temp = sc.nextDouble(); if (temp > 103.5) {
		 * System.out.println("Fever Yes "); } else { System.out.println("Fever No"); }
		 */

		// Qu 3. FizzBuzz
		/*
		 * System.out.print("Enter a number :"); int n = sc.nextInt(); if (n % 15 == 0)
		 * { System.out.println("FizzBuzz"); } else if (n % 3 == 0) {
		 * System.out.println("Fizz"); } else if (n % 5 == 0) {
		 * System.out.println("Buzz"); } else { System.out.println(n); }
		 */

		// Qu 4. WeekDay or Weekend
		/*
		 * int n = sc.nextInt(); switch (n) { case 1, 2, 3, 4, 5:
		 * System.out.println("Weekday"); break; case 6, 7:
		 * System.out.println("Weekend"); break; default: System.out.println("Error");
		 * break; }
		 */

		// Qu 5. Time Zone Convert
		System.out.println("Day : Hour : Minute");
		int day = sc.nextInt();
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		hour += 5;
		minute += 30;

		if (minute >= 60) {
			hour++;
			minute -= 60;
		}
		if (hour >= 24) {
			day++;
			hour -= 24;
		}
		System.out.println("Day : " + day + " Hour : " + hour + " Minute : " + minute);

		sc.close();
	}

}

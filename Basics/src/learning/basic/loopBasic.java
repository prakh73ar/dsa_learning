package learning.basic;

import java.util.Scanner;

public class loopBasic {
	public static void main(String[] args) {
		/*
		 * // System.out.println("Hello World"); // System.out.println("Hello World");
		 * // System.out.println("Hello World"); // System.out.println("Hello World");
		 * // System.out.println("Hello World");
		 */
		/*
		 * int n = 0; while (n < 100) { System.out.println("Hello World"); n++; }
		 * System.out.println("Printed HW 100x");
		 */

		Scanner sc = new Scanner(System.in);
		/*
		 * int n = sc.nextInt(); int i = 1; while (i <= n) { System.out.println(i); i++;
		 * }
		 *//*
			 * 
			 * int n = sc.nextInt(); int sum = 0; int i = 1; while (i <= n) { sum = sum + i;
			 * i++; }
			 * 
			 * System.out.println(sum);
			 *//*
				 * for (int i = 1; i <= 10; i++) { System.out.println("Hello World"); }
				 *//*
					 * for (int i = 1; i <= 4; i++) { System.out.println("* * * *");
					 * System.out.println( ); }
					 */

		/*
		 * int n = 10899; while (n > 0) { int lastDigit = n % 10;
		 * System.out.print(lastDigit); n=n/10; }
		 */
		/*
		 * int n = 10899; int rev = 0;
		 * 
		 * while (n > 0) { int lastDigit = n % 10;
		 * 
		 * rev = (rev * 10) + lastDigit; n = n / 10; }
		 * System.out.println("Reverse is : " + rev);
		 *//*
			 * 
			 * int i = 1; do { System.out.println("Hello World"); i++; } while (i <= 10);
			 *//*
				 * 
				 * do { System.out.println("Enter your number : "); int n = sc.nextInt();
				 * 
				 * if (n % 10 == 0) { break; } System.out.println(n); } while (true);
				 * System.out.println("I am out ");
				 *//*
					 * int n = sc.nextInt(); if (n == 2) { System.out.println("n is Prime"); } else
					 * {
					 * 
					 * boolean isPrime = true; for (int i = 2; i < n - 1; i++) { if (n % i == 0) {
					 * isPrime = false; } } if (isPrime == true) { System.out.println(n +
					 * " is Prime"); } else { System.out.println(n + " is not a Prime"); } }
					 */
		int n = sc.nextInt();

		if (n == 2) {
			System.out.println("2 is Prime");
		} else {

			boolean isPrime = true;

			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
				}

			}
			if (isPrime == true) {
				System.out.println(n + " is Prime");
			} else {
				System.out.println(n + " is not Prime");
			}
		}
		sc.close(); 
	}
}

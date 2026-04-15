package learning.important;

//import java.util.Scanner;

public class PrimeNo {
//	private static boolean isPrime(int n) {
//		boolean isPrime = true;
//		
//		if (n==2) {
//			return true;
//		}
//		
//		for (int i = 2; i <= n - 1; i++) {
//			if (n % i == 0) {
//				isPrime = false;
//				break;
//			}
//
//		}
//		return isPrime;
//	}

	public static void main(String[] args) {
		primeRange(20);
		// System.out.println(isPrime(7));
//		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
//		System.out.println(isPrime(n));
//		if (n == 2) {
//			System.out.println("n is prime");
//		} else {
//
//			boolean isPrime = true;
//			for (int i = 2; i < n - 1; i++) {
//				if (n % i == 0) { // n is a multiple of i (i not equal to 1 or n )
//					isPrime = false;
//				}
//
//			}
//			if (isPrime == true) {
//				System.out.println("n is prime");
//			} else {
//				System.out.println("n is not prime");
//			}
//		}

		// sc.close();
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeRange(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
}

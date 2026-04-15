package learning.loops;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row :");
		// int n = sc.nextInt();
		// int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j || j - i == -2 || j - i == -4) {
					System.out.print("1");
				} else if (j - i == -1 || j - i == -3) {
					System.out.print("0");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

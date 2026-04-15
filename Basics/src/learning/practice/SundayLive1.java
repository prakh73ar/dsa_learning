package learning.practice;

import java.util.Scanner;

public class SundayLive1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n = sc.nextInt();
		int a = 1;
		int b = 1;
		for (int i = 3; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println(b);
		sc.close();
	}
}

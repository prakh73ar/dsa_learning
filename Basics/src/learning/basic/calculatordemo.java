package learning.basic;

import java.util.Scanner;

public class calculatordemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter a :" + a);
		int b = sc.nextInt();
		System.out.println("Enter a :" + b);

		char operator = sc.next().charAt(0);
		System.out.println("Enter a :" + b);
		switch (operator) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		default:
			System.out.println("Please you correct Key");
			break;
		}
		sc.close();
	}
}

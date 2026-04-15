package learning.functions;

public class MethoBasic {
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		return;
	}

	public static void calculateSum(int a, int b) {// parameters

		int sum = a + b;
		System.out.println("Sum is : " + sum);

	}

	public static void swap(int a, int b) {
		// swap
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		// printHelloWorld();
		/*
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt(); int b =
		 * sc.nextInt(); sc.close();
		 */
		// calculateSum(a, b);// arguments
		swap(5, 10);
	}
}

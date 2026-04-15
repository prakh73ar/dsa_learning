package learning.array;

public class LargestNum {
	public static int getLargest(int numbers[]) {
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 6, 3, 5 };
		int number = getLargest(num);
		System.out.println("largest value is : " + number);
	}
}

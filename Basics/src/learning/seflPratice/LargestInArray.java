package learning.seflPratice;

public class LargestInArray {
	public static int largestElement(int arr[]) {
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 5, 1, 9, 3 };

		System.out.println(largestElement(nums));
	}
}

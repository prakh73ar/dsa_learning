package learning.array;

public class MaxSubarray {

	public static void printSubarray(int numbers[]) {
		int n = numbers.length;
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int start = i;
			for (int j = i; j < n; j++) {
				int end = j;
				currSum = 0;
				for (int k = start; k <= end; k++) {
					currSum = currSum + numbers[k];
				}
				System.out.println(currSum);
				if (maxSum < currSum) {
					maxSum = currSum;
				}
			}
		}
		System.out.println(maxSum);
	}

	public static void main(String[] args) {
		int numbers[] = { 1, -2, 6, -1, 3 };
		printSubarray(numbers);
	}
}
package learning.seflPratice;

public class qu1 {

	// brute
	public static int[] sumOfTwo(int nums[], int target) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				sum = nums[i] + nums[j];
				if (sum == target) {
					return new int[] { i, j };

				}
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(sumOfTwo(nums, target));
	}
}

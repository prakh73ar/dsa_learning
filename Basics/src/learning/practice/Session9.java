package learning.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Session9 {

	// Ques 1 Container with Most Water
	// Brute Force
//	public static int max_Area(int height[]) {
//		int max = 0;
//		int n = height.length;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				int breadth = Math.abs(j - i);
//				int length = Math.min(height[i], height[j]);
//				int area = breadth * length;
//				max = Math.max(area, max);
//			}
//		}
//
//		return max;
//	}
//
//	// Two Pointer approch
//	public static int maxArea(int height[]) {
//		int max = 0;
//		int n = height.length;
//		int left = 0;
//		int right = n - 1;
//		while (left < right) {
//			int area = 0;
//			int length = Math.min(height[left], height[right]);
//			int breadth = Math.abs(left - right);
//			area = length * breadth;
//			max = Math.max(area, max);
//			if (height[left] <= height[right]) {
//				left++;
//			} else {
//				right--;
//			}
//		}
//
//		return max;
//	}
//
//	public static void main(String[] args) {
//
//		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
//		System.out.println(maxArea(height));
//
//	}

	// Ques 2 Lonely Numbers in ArrayList
	public static ArrayList<Integer> LonelyNumber(int arr[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (arr.length == 0) {
			return list;
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			boolean hasLeftConflict = i > 0 && (arr[i - 1] == arr[i] || arr[i - 1] == arr[i] - 1);
			boolean hasRightConflict = i < arr.length - 1 && (arr[i + 1] == arr[i] || arr[i + 1] == arr[i] + 1);

			if (!hasLeftConflict && !hasRightConflict) {
				list.add(arr[i]);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		int arr1[] = { 10, 6, 5, 8 };
		int arr2[] = { 1, 3, 5, 3 };
		System.out.println(LonelyNumber(arr1));
		System.out.println(LonelyNumber(arr2));
	}

}

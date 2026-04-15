package learning.sorting;

public class SortingBasics {

	public static void bubbleSort(int arr[]) {
		for (int turns = 0; turns < arr.length - 1; turns++) {
			for (int i = 0; i < arr.length - 1 - turns; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public static void printArr(int arr[]) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 3, 2 };
		bubbleSort(arr);
		printArr(arr);
	}
}

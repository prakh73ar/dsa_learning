package learning.array;

public class ArrayCC {

	public static void update(int marks[]) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = { 97, 98, 99 };
		update(marks);

		// for print marks
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println();
	}

}

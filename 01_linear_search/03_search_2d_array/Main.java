import java.util.Arrays;

public class Main {
	public static void main(String ... args) {
		int[][] arr = new int[][] {
			{1, 78, -120},
			{10, 56, 733, 67, 92},
			{-1, -65, 245, 58},
			{18, 21}
		};

		System.out.println(search(arr, 245));
		System.out.println(Arrays.toString(searchIndex(arr, 245)));
	}

	public static boolean search(int[][] arr, int target) {
		for (int[] array : arr) {
			for (int num : array) {
				if (num == target) {
					return true;
				}
			}
		}

		return false;
	}

	public static int[] searchIndex(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] {row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}
}

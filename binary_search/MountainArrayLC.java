/*
   find peak index in mountain array: arr.length >= 3, O(log n)
   arr = [0, 1, 0] output: 1
   arr = [0, 2, 1] output: 1
*/
public class MountainArrayLC {
	public static void main(String ... args) {
		System.out.println(searchPeakIndex(new int[] { 0, 1, 0 })); // 1
		System.out.println(searchPeakIndex(new int[] { 0, 1, 3, 5, 8, 6, 4, 2 })); // 4
	}

	private static int searchPeakIndex(int[] arr) {
		int start = 0, end = arr.length - 1, ans = -1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid + 1]) end = mid; // in decreasing part of the array
			else start = mid + 1; // in increasing part of the array
		}
		return start; // or end because start = end
	}

	private static int searchElement(int arr[], int target) {
	}
}

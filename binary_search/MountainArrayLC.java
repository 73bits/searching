/*
   find peak index in mountain array: arr.length >= 3, O(log n)
   arr = [0, 1, 0] output: 1
   arr = [0, 2, 1] output: 1

   return the minimum index
   arr = [ 0, 1, 0 ] target: 0 output: 0
   arr = [ 0, 1, 3, 5, 8, 6, 4, 2 ] target: 2 output: 7
   arr = [ 0, 1, 3, 5, 8, 6, 4, 2 ] target: 7 output: -1
*/
public class MountainArrayLC {
	public static void main(String ... args) {
		System.out.println(searchPeakIndex(new int[] { 0, 1, 0 })); // 1
		System.out.println(searchPeakIndex(new int[] { 0, 1, 3, 5, 8, 6, 4, 2 })); // 4

		System.out.println(searchElement(new int[] { 0, 1, 0 }, 0)); // 0
		System.out.println(searchElement(new int[] { 0, 1, 3, 5, 8, 6, 4, 2 }, 2)); // 7
		System.out.println(searchElement(new int[] { 0, 1, 3, 5, 8, 6, 4, 2 }, 7)); // -1
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

	// return the minimum index of the target in a mountain array
	private static int searchElement(int arr[], int target) {
		int peakIndex = searchPeakIndex(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peakIndex);
		if (firstTry != -1) return firstTry;
		return orderAgnosticBS(arr, target, peakIndex + 1, arr.length - 1);
	}

	private static int orderAgnosticBS(int arr[], int target, int start, int end) {
		boolean isAscending = arr[start] < arr[end];
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) return mid;
			if (isAscending) {
				if (arr[mid] > target) end = mid - 1;
				else start = mid + 1;
			} else {
				if (arr[mid] < target) end = mid - 1;
				else start = mid + 1;
			}
		}
		return -1;
	}
}

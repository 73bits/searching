/*
   search an element in a sorted array of infinite numbers
   arr.lenght is nor known
*/
public class InfiniteArray {
	public static void main(String ... args) {
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < target) start = mid + 1;
			else if (arr[mid] > target) end = mid - 1;
			else return mid;
		}
		return -1;
	}
}

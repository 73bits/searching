public class CeilingFloor {
	public static void main(String ... args) {
		int[] arr = new int[] { 2, 3, 5, 9, 14, 16, 18 };
		int target = 11;
		System.out.println("target index: " + ceiling(arr, target));
	}

	private static int ceiling(int[] arr, int target) {
		// might be possible that index[arr.length - 1] is smaller that target
		if (target > arr[arr.length - 1]) return -1;
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) return mid;
			if (arr[mid] < target) start = mid + 1;
			if (arr[mid] > target) end = mid - 1;
		}
		return start;
	}
}

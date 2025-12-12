public class Main {
	public static void main(String ... args) {
		int[] arr = new int[] {-1, 2, 5, 8, 9, 16, 24, 98, 112, 456};
		int target = 112;
		System.out.println("target index: " + search(arr, target));
		System.out.println("target index: " + search(arr, target, 0, arr.length));
	}

	private static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) return mid;
			if (arr[mid] > target) end = mid - 1;
			if (arr[mid] < target) start = mid + 1;
		}
		return -1;
	}

	private static int search(int[] arr, int target, int start, int end) {
		int mid = (start + end) / 2;
		if (start > end) return -1;
		if (arr[mid] == target) return mid;
		if (arr[mid]  > target) return search(arr, target, start, mid - 1);
		return search(arr, target, mid + 1, end);
	}
}

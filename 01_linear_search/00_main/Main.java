public class Main {
	public static void main(String ... args) {
		int[] arr = new int[] {4, 1, -42, 81, 65, 73};
		System.out.println("index: " + linearSearch(arr, 65));
		System.out.println("index: " + linearSearch(arr, -42));
		System.out.println("index: " + linearSearch(arr, 112));
	}

	// take array and target as input
	// return index of target or -1 in case of failure
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}

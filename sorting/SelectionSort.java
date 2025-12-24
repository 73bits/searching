public class SelectionSort {
	public static void main(String ... args) {
		System.out.println(java.util.Arrays.toString(selectionSort(new int[] { 3, 1, 0, -82, 73, 991, 5 })));
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		return arr;
	}
}

/*
   first and last position of element in sorted array
   nums = [5, 7, 7, 8, 8, 10]
   target = 8, output = [3, 4]
   target = 9, output = [-1, -1]
 */
public class FirstLastLC {
	public static void main(String ... args) {
		int[] nums = new int[] {5, 7, 7, 8, 8, 10};
		int target = 7;
		System.out.println(java.util.Arrays.toString(firstAndLastPosition(nums, target)));
	}

	private static int[] firstAndLastPosition(int[] nums, int target) {
		int[] ans = new int[] {index(nums, target, true), index(nums, target, false)};
		return ans;
	}

	// if target is found
	// and if startIndex is true this will find first index of target (on left)
	// and if startIndex is false this will find last index of target (on right)
	private static int index(int[] nums, int target, boolean startIndex) {
		int start = 0, end = nums.length - 1, ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] > target) end = mid - 1;
			else if (nums[mid] < target) start = mid + 1;
			else {
				ans = mid;
				if (startIndex) end = mid - 1;
				else start = mid + 1;
			}
		}
		return ans;
	}
}

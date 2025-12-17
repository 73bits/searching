/*
   return the next greatest letter with wrap arround
   letters['c', 'f', 'j', 'm', 'w', 'x']
   target = 'f', return 'j'
   target = 'x', return 'c'
*/
public class LCNextGreatest {
	public static void main(String ... args) {
		char[] letters = new char[] { 'c', 'f', 'j', 'm', 'w', 'x' };
		char target = 'j';
		System.out.println(nextGreatestLetter(letters, target));
	}

	private static char nextGreatestLetter(char[] letters, char target) {
		int start = 0, end = letters.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (letters[mid] > target) end = mid - 1;
			else start = mid + 1;
		}
		return letters[start % letters.length];
	}
}

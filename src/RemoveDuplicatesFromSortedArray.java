
public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int count = 1;
		int i = 1;
		int left = 1;
		while (i < nums.length) {
			if (nums[i] == nums[i - 1]) {
				i++;
			} else {
				nums[left] = nums[i];
				left++;
				count++;
				i++;
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 3, 3, 3, 4 };
		System.out.println(removeDuplicates(arr));
	}

}

package com.practice.wissen;

public class RemoveDuplicates {
	public static int removeDuplicatesAllowTwo(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int i = 1, count = 1;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] == nums[j - 1]) {
				count++;
			} else {
				count = 1;
			}

			if (count <= 2) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {

		// two occurances
		int[] nums1 = { 1, 1, 1, 2, 2, 3 };
		int k1 = removeDuplicatesAllowTwo(nums1);
		System.out.println("two occurances count: " + k1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(i < k1 ? nums1[i] + " " : "null ");
		}
	}
}

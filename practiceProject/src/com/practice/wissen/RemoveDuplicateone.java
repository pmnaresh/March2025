package com.practice.wissen;

public class RemoveDuplicateone {
	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {// one occurance
		int[] nums = { 1, 1, 2 };
		int k = removeDuplicates(nums);
		System.out.println("Unique count: " + k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(i < k ? nums[i] + " " : "null ");
		}
	}
}

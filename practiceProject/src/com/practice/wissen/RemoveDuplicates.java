package com.practice.wissen;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public static int removeDuplicatesAllowTwo(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

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
    	
    	//one occurance
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i < k ? nums[i] + " " : "null ");
        }
        
        System.out.println("****");
        // two occurances
        int[] nums1=  {1,1,1,2,2,3};
        int k1 =  removeDuplicatesAllowTwo(nums1);
        System.out.println("Unique count: " + k1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(i < k1 ? nums1[i] + " " : "null ");
        }
    }
}

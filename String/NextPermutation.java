package com.code.preparation.twopointers;

public class NextPermutation {
	public static void main(String[] args) {
		int[] nums= {3,2,1};
		findNextPerm(nums);
		System.out.println(nums);
	}

	private static void findNextPerm(int[] nums) {
		int i = nums.length - 2;
		int j = nums.length - 1;

        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }
	private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
	
    }
}

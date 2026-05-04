package com.leetcode.arrays;
//interview Questions
public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] nums= {1,0,1,1,0};
		System.out.println(maxConsecutiveOnes(nums));
		
	}
//2 ms
	private static int maxConsecutiveOnes(int[] nums) {
		 int k = 1, low = 0, zeroCount = 0, result = 0;
	        for (int i=0; i<nums.length; i++) {
	            if (nums[i] == 0) {
	                zeroCount++;
	            }
	            while (zeroCount > k) {
	                if (nums[low] == 0) {
	                    zeroCount--;
	                }
	                low++;
	            }
	            result = Math.max(result, i - low + 1);
	        }
		
		return result;
	}
	
//1 ms	
public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0;
        int lastZeroIndex = -1;
        int left = 0;
        int right = 0;
        
        while (right < nums.length) { 
            if(nums[right] == 1) {
                //do nothing;
            } else if (nums[right] == 0 && lastZeroIndex < 0) {
                lastZeroIndex = right;
            } else {
                maxOnes = Math.max(maxOnes, right - left);
                left = lastZeroIndex + 1;
                right = right-1;
                lastZeroIndex = -1;
            }    
            right++;
        }
        
        return Math.max(maxOnes, right - left);
    }

}

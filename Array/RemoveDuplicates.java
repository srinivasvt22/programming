package com.leetcode.arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
//1ms
	private static int removeDuplicates(int[] nums) {
	
		int j=0;
		for(int i=0;i<nums.length;i++) {
			
			if(i<nums.length-1 && nums[i]!=nums[i+1]) {
				nums[j]=nums[i];
				j++;
			}
			if(i==nums.length-1) {
				nums[j]=nums[i];
				j++;
			}
		}
		
		return j;
	}
	//0ms
	private static int removeDuplicates_method2(int[] nums) {
		
		 if(nums.length <= 1) return nums.length;
	        
	        int lastNum = nums[0];
	        for(int i=1;i<nums.length;i++){
	            if(nums[i] == lastNum)
	                nums[i] = -10001;
	            else lastNum = nums[i];
	        }
	        
	        int index = 0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] != -10001){
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        
	        return index;
	    }
	
	
	
}

package com.code.preparation.twopointers;

public class TwoSumII {
	public static void main(String[] args) {
		int[] numbers= {2,7,11,15};
		int target=9;
		System.out.println(twoSum(numbers,target));
	}
	//Time complexity: O(n)
	//Space complexity: O(1)
	public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        
       while(right<numbers.length) {
    	   if(numbers[left]+numbers[right]==target) 
    		return new int[] {left+1,right+1};  
    	   else if(numbers[left]+numbers[right] > target)
    		   right--;
    	   else
    		   left++;
    	}
       return new int[] {-1,-1};
    }


}

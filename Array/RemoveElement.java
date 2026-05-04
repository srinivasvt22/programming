package com.leetcode.arrays;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] nums= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(nums,val));
		
	}
//1ms
	private  static int removeElement(int[] nums, int val) {
		 /*int length=nums.length;
	       int  j=nums.length-1;
	        for(int i=nums.length-1;i>=0;i--){
	            
	            if( nums[i]==val){
	            	int temp=nums[j];
	            	nums[j]=nums[i];
	            	nums[i]=temp;
	            	j--;
	                length--;
	            }
	      }
	        return length;*/
	        //0ms
	        int j = 0;
	        for(int i=0; i < nums.length; i++){
	            if(nums[i] != val){
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        return j;
	        
		
	}

}

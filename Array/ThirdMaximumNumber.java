package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] nums= {2,2,3,1};
		System.out.println(thirdMaximumNumber(nums));
		
	}

	private static int thirdMaximumNumber(int[] nums) {
		int max= Integer.MIN_VALUE,sec_max= Integer.MIN_VALUE,third_max= Integer.MIN_VALUE;
		
		for(int num :nums) {
			
			if(num==max ||num==sec_max ||num==third_max) {
				continue;
			}
			if(num>max) {
				third_max=sec_max;
				sec_max=max;
				max=num;
			}else if(num>sec_max) {
				third_max=sec_max;
				sec_max=num;
				
			}else if(num>third_max) {
				third_max=num;
			}
			
		}
		
				
		return (third_max >0?third_max:max);
	}
	
	
	//2 ms
		private static int thirdMaximumNumber_method2(int[] nums) {
			Set<Integer> set = new HashSet<>();
	        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
	        
	        for (int n : nums) {
	            if (set.contains(n)) continue;
	            if (n > max) {
	                max3 = max2;
	                max2 = max;
	                max = n;
	            } else if (n > max2) {
	                max3 = max2;
	                max2 = n;
	            } else if (n > max3) {
	                max3 = n;
	            }
	            set.add(n);
	        }
	        
	        if (set.size() >= 3) return max3;
	        else return max;
		}
		
		//0 ms
		
		 public int thirdMax(int[] nums) {
		        double max=Double.NEGATIVE_INFINITY, second_max=Double.NEGATIVE_INFINITY, third_max=Double.NEGATIVE_INFINITY;

		        for (int i=0;i<nums.length;i++){
		            if (nums[i]>max){
		                third_max=second_max;
		                second_max=max;
		                max=nums[i];
		            }
		            else if (nums[i]<max && nums[i]>second_max){
		                third_max=second_max;
		                second_max=nums[i];
		            }
		            else if (nums[i]<second_max && nums[i]>third_max){
		                third_max=nums[i];
		            }
		        }
		        if (third_max==Double.NEGATIVE_INFINITY){
		            return (int) max;
		        }
		        return (int) third_max;
		    }
}

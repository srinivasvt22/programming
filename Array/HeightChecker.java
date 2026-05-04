package com.leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {
	
	public static void main(String[] args) {
		
		int[] heights= {1,1,4,2,1,3};
		
		System.out.println(heightChecker(heights));
	}

	
	public static int heightChecker(int[] heights) {
		
		int[] result= new int[heights.length];
		
		for(int i=0;i<heights.length;i++ ) {
			
			result[i]=heights[i];
			
		}
		Arrays.sort(heights);
		int count=0;
		for(int i=0;i<heights.length;i++ ) {
			
			if(heights[i]!=result[i])
				count++;
			
		}
		
		
		return count;
	}
}

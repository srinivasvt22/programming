package com.code.preparation.twopointers;

public class ContainerWithMostWater {
	/*
	 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
	 */
	public static void main(String[] args) {
		int [] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
		System.out.println(maxAreaTwoPointers(height));
		
	}
	//O(n2)
	private static int maxArea(int[] height) {
		int maxArea=0;
		
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				
				int localArea=(j-i) * Math.min(height[i], height[j]);
				maxArea=Math.max(maxArea, localArea);
			}
		}
		
		return maxArea;
	}
	//With Two Pointer approach for linear solutionO(n)
	private static int maxAreaTwoPointers(int[] height) {
		int maxArea=0,left=0,right=height.length-1;
		
		while(left<right) {
			int width = right - left;
			if(height[left] < height[right]) {
				maxArea = Math.max(maxArea, width * height[left]);
				left++;
			} else {
				maxArea = Math.max(maxArea, width * height[right]);
				right--;
			}
		}
		
		
		return maxArea;
	}
}

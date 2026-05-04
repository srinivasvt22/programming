package com.code.preparation.twopointers;

public class TrappingRainWater {
	public static void main(String[] args) {
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(findTraprainWater(height));
		
	}

	private static int findTraprainWater(int[] height) {
		int max=0,sum=0;
		int[] left_max=new int[height.length];
		int[] right_max=new int[height.length];
		
		for(int i=0;i<height.length;i++) {
			max=Math.max(height[i], max);
			left_max[i]=max;
		}
		max=0;
		for(int j=height.length-1;j>=0;j--) {
			max=Math.max(height[j], max);
			right_max[j]=max;
			
		}
		max=0;	
		for(int j=0;j<height.length;j++) {
			sum+=Math.min(left_max[j], right_max[j])-height[j];
			
			
		}
		
		
		return sum;
	}

}

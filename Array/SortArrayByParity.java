package com.leetcode.arrays;

public class SortArrayByParity {
	
	public static void main(String[] args) {
		
		int[] A= {0,1,2};
		System.out.println(sortArrayByParity_method2(A));
		
	}
	//1ms
	private static int[] sortArrayByParity(int[] A) {
		
		
		int j=0;
		
        for(int i=A.length-1;i>j;i--) {
        	
        		if((A[i]%2==0)  && !(A[j]%2==0)) {
            		int temp=A[i];
            		A[i]=A[j];
            		A[j]=temp;
            		j++;
            	}else if(!(A[i]%2==0)  && (A[j]%2==0)) {
            		j++;
            	}else if((A[i]%2==0)  && (A[j]%2==0)) {
            		j++;
            		i++;
            	}
        }
        
       return A;
	}
	//0 ms
	public static int[] sortArrayByParity_method2(int[] A) {
        int len = 0;
        for (int i=0; i<A.length; i++) {
            int ele = A[i];
            if (ele%2 == 0) {
                A[i] = A[len];
                A[len++] = ele;
            }
        }
        return A;
    }

}

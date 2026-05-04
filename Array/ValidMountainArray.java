package com.leetcode.arrays;

public class ValidMountainArray {
	public static void main(String[] args) {
		
		int[] arr= {2,1,2,3,5,7,9,10,12,14,15,16,18,14,13};
		System.out.println(validMountainArray(arr));
	}
	
//3 ms
public static boolean validMoutain(int[] arr) {
	
	 boolean isIncrease=false;
	 boolean isDecrease=false;
		

		for(int i=0;i<arr.length-1;i++) {
			if(isIncrease && arr[i] >arr[i+1]) {
				isDecrease=true;
				    
			}else if(arr[i] < arr[i+1]) {
				if(isDecrease)
					return false;
				else
					isIncrease=true;
			}else if(arr[i] == arr[i+1]){
                return false;
            }
			if(i==0 && isIncrease) 
				return false;
			
		}
		
		if(isDecrease && isIncrease) {
			return true;
		}
		
		return false;
	
}

//1 ms
public static boolean validMountainArray(int[] arr) {
	
    if(arr == null || arr.length < 3)
        return false;
    int i=0;
    int l=arr.length;
    while(i+1<l && arr[i]<arr[i+1])
        i++;
    if(i==0 || i==l-1)
        return false;
    while(i+1<l && arr[i]>arr[i+1])
        i++;
    return i == l-1;
}
}

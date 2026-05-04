package com.leetcode.arrays;

public class CheckExist {
	
	public static void main(String[] args) {
		
		int[] arr= {0,0};
		System.out.println(checkExistOrNot(arr));
		System.out.println(checkIfExist(arr));
	}
//3ms	
public static boolean checkExistOrNot(int[] arr) {
	
	if(arr.length==0 ||arr==null)
        return false;
    
   
    
    for(int i=0;i<arr.length;i++){
        
         for(int j=i+1;j<arr.length;j++) {
        	 
        	 if(arr[i]==2*arr[j]||(arr[j]%2==0 && arr[i]==arr[j]/2))
        		 return true;
         }
        
    }
    
    
         
     
    return false; 
	
	
	
}

//0 ms
public static boolean checkIfExist(int[] arr) {
    int[] doubles = new int[4001];
    for (int n : arr) {
        if (doubles[n + 2000] == 2 || doubles[n * 2 + 2000] == 1)
            return true;
        doubles[n * 2 + 2000] = 2;
        doubles[n + 2000] = 1;
    }
    return false;
}

}

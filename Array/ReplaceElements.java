package com.leetcode.arrays;

public class ReplaceElements {
	public static void main(String[] args) {
		int[] arr= {17,18,5,4,6,1};
		
		System.out.println(replaceElements_method(arr));
		
		
	}
//445 ms
	private static int[] replaceElements(int[] arr) {
		

        if(arr.length==1){
            arr[arr.length-1]=-1;
             return arr;
        }
            
        
        int max=0;
         
            
       for(int i=0;i<arr.length-2;i++){

             for(int j=i+1;j<arr.length-1;j++){
                
                 max=Math.max(arr[i],arr[j]);
                arr[i]=max;
                
                 
              }           
                arr[i+1]=0;
                
        }
        arr[arr.length-2]=arr[arr.length-1];
        arr[arr.length-1]=-1;
        return arr;
	}
	//0 ms
	public static int[] replaceElements_method(int[] arr) {
        int max = -1;
       for (int i = arr.length - 1; i >= 0 ;i--) {
           if (max < arr[i]) {
               int temp = arr[i];
               arr[i] = max;
               max = temp;
           }
           else {
               arr[i] = max;
           }
       }
       return arr;
   }

}

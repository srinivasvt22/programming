package com.leetcode.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
	public static void main(String[] args) {
		
		int[] arr= {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		
	}

	
	public static void duplicateZeros(int[] arr) {
		
		//create new array and add the nums and assign old array
		/*int[] result=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
						
			if(j<arr.length && arr[i]==0) {
				result[j]=0;
				result[j+1]=0;
				j=j+2;
			}else {
				if(j<arr.length) {
					result[j]=arr[i];
					j++;
				}
			}
			
		}
		arr=result;*/
		
		//Modify same array 13 ms
		/* for (int i = arr.length - 1; i >= 0; i--) {
		        if (arr[i] == 0) {
		            // duplicate it!
		            for (int j = arr.length - 1; j > i; j--) {
		                arr[j] = arr[j-1];
		            }
		        }
		    }*/
		//2ms
		/*Queue<Integer> queue = new LinkedList<Integer>(); 
        for(int i = 0; i < arr.length; i++){
            queue.add(arr[i]);
            if(arr[i] == 0){
                queue.add(0);
            }
            arr[i] = queue.poll();
        }*/
        
        //0 ms
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included  
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
		
		
	}
}

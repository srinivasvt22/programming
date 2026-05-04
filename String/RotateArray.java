package com.string;

public class RotateArray {
	
	public static void main(String[] args) {
		
		//String[] str= new String [] {"1","2","3","4","5"};
		String [] str= new String[] {"2", "4", "6", "8", "10", "12", "14", "16", "18", "20"};
		int d=3;
		
		rotateArray(str,d);
	}

	private static void rotateArray(String[] str,int d) {
		
		
		while(d!=0) {
			
			String j=str[0];
		
		for(int i=0; i<str.length; i++) {
			
			if(i!=str.length-1) {
				str[i]=str[i+1];		
				
			}else {
				str[i]=j;
			}
			
		}
		d--;
		}
		
		
	}

}

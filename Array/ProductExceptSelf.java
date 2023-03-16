  //TC:O(n)
	//SC:O(1)
	private static int[] productArray(int[] nums) {
		int[] result= new int[nums.length];
		
		int product=1;
		//Multiply by left to right
		for(int i=0;i<nums.length;i++) {
			result[i]=product;
            product*=nums[i];
		
		}
     product=1;
     //Multiply by right to left
		for(int i=nums.length-1;i>=0;i--) {
			result[i]*=product;
            product*=nums[i];
		
		}
        return result;
    
	}

private static int minBuyMaxSell(int[] prices) {
		//Initialize
		int max=0,min=Integer.MAX_VALUE;
		
		//Iterate an array	
		for(int start=0;start<prices.length;start++) {
			
      //find Min & Max
			min=Math.min(prices[start], min);
			max=Math.max(prices[start]-min, max);
				
        }
		
		return max;
	}

//TC:O(n)
//SC:o(1)
private static int maximumSubArray(int[] nums) {
	
int sum=0,max=0,min=Integer.MIN_VALUE;


for(int i=0;i<nums.length;i++) {

sum+=nums[i];
//find the max negative value
min=Math.max(min, sum);
if(sum<0) 
   sum=0;
//find the max positive value
max=Math.max(max, sum);
}
 return max<=0?min:max;
}

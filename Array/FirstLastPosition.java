//O(log n) runtime complexity.
	private static int[] firstLastPosition(int[] nums,int target) {
		 int Tleft = find(target, nums, 0);
	        if (Tleft == nums.length || nums[Tleft] != target) return new int[] {-1, -1};
	        return new int[] {Tleft, find(target+1, nums, Tleft) - 1};
	    }
	    private static int find(int target, int[] arr, int left) {
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + right >> 1;
	            if (arr[mid] < target) left = mid + 1;
	            else right = mid - 1;
	        }
	        return left;
	    }

/*
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
//Time Complexity: Exponential
		//Space Complexity: O(sum / minimum in array) // if recursion stack space is ignored
	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		  Arrays.sort(candidates);
		    List<List<Integer>> res = new ArrayList<>();
		    if (candidates.length == 0 || candidates[0] > target) {
		        return res;
		    }
		    res = recursive(candidates, target, 0);
		    return res;
		}

		private static List<List<Integer>> recursive(int[] arr, int target, int start) {
		    List<List<Integer>> res = new ArrayList<>();

		    if (start >= arr.length || arr[start] > target) {
		        return res;
		    }
		    if (target == arr[start]) {
		        List<Integer> t = new ArrayList<>();
		        t.add(arr[start]);
		        res.add(t);
		        return res;
		    }

		    for (int j = start; j < arr.length; j++) {
		        if (target == arr[j]) {
		            List<Integer> t = new ArrayList<>();
		            t.add(arr[j]);
		            res.add(t);
		            break;
		        }
		        List<List<Integer>> temp = recursive(arr, target - arr[j], j);
		        if (!temp.isEmpty()) {
		            for (List<Integer> t : temp) {
		                t.add(0, arr[j]);
		                res.add(t);
		            }
		        }
		    }
		    return res;
		}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {  // start from i+1 to avoid duplicates
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};  // return the indices
                }
            }
        }
        return new int[] {}; // return empty array if no result
    }
}

public class Lc_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 6, 7, 3, 8};
        int target = 9;
        int[] result = sol.twoSum(nums, target);

        if(result.length == 2) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found");
        }
    }
}

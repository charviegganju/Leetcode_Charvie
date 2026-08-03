import java.util.*;

class Lc_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        Lc_53 sol53 = new Lc_53();

        int result = sol53.maxSubArray(nums);
        System.out.println(result);

    }
}
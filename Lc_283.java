import java.util.*;

class Lc_283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args){
        Lc_283 sol = new Lc_283();
        int[] nums = {3, 0, 0, 1, 0, 4, 5};
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
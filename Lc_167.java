import java.util.*;

public class Lc_167 {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Lc_167 obj = new Lc_167();
        int[] result = obj.twoSum(nums, target);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
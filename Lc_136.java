class Lc_136 {
    public int singleNumber(int[] nums) {
        int odd = 0;
        for (int x : nums) {
            odd = odd ^ x;
        }
        return odd;
    }

    public static void main(String[] args) {
        Lc_136 sol = new Lc_136();
        int[] nums = {4, 3, 4, 5, 3};
        System.out.println(sol.singleNumber(nums));
    }
}
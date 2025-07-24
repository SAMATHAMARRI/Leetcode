class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(solve(0, nums),solve(1, nums));
    }
    static int solve(int strIdx, int[] nums){
        int n = strIdx == 0 ? nums.length - 1 : nums.length;
        int dp[] = new int[nums.length];
        dp[strIdx] = nums[strIdx];
        for(int i = strIdx + 1; i < n; i++){
            if(i == 1){
                dp[i] = Math.max(dp[i - 1], nums[i]);
            }
            else{
                dp[i] = Math.max(dp[i- 1], dp[i - 2] + nums[i]);
            }
        }
        return n == nums.length ? dp[nums.length - 1] : dp[nums.length - 2];

    }
}
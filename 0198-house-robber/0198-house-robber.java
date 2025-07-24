class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length < 2){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        int max = Math.max(dp[0], dp[1]);
        for(int i = 2; i < nums.length; i++){
            for(int j = 0; j <= i - 2; j++){
                dp[i] = Math.max(dp[i], dp[j]+nums[i]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
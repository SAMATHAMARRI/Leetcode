class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length < 2){
            return nums[0];
        }
        dp[0] = nums[0];
        
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        for(int i = 1; i < nums.length; i++){
            if(i == 1) dp[i] = Math.max(dp[i - 1], nums[i]);
            else
                dp[i] = Math.max(dp[i -1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
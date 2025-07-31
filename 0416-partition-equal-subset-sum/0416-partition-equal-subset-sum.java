class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if(sum % 2 != 0) return false;
        sum = sum / 2;
        boolean dp[][] = new boolean[nums.length][sum + 1];
        for(int i = 0; i < nums.length; i++) dp[i][0] = true;
        if(nums[0] <= sum) dp[0][nums[0]] = true;
        for(int i = 1; i < nums.length; i++){
            boolean pick = false, unpick = false;
            for(int j = 1; j <= sum; j++){
                unpick = dp[i - 1][j];
                if(nums[i] <= j) pick = dp[i - 1][j - nums[i]];   
                dp[i][j] = pick || unpick;
            }
        }
        return dp[nums.length - 1][sum];

    }
}
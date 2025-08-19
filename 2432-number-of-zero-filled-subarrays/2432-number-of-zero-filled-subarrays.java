class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, streak = 0;
        for(int i = 0; i < nums.length; i++){
              streak = nums[i] == 0 ? streak + 1 : 0;
              cnt += streak;
        }
        return cnt;
    }
}
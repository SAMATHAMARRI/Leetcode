class Solution {
    public int singleNumber(int[] nums) {
        int numXor = 0;
        for(int i = 0; i < nums.length; i++){
            numXor ^= nums[i];
        }
        return numXor;
    }
}
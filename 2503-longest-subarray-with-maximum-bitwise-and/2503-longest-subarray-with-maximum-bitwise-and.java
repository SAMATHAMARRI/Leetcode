class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }
        int currLen = 0, maxLen = 0;
        for(int num : nums){
            if(num == max){
                currLen++;
            }
            else{
                currLen = 0;
            }
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}
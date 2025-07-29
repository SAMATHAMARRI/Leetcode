class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int result[] = new int[nums.length];
        int setBitIndex[] = new int[32]; //will give index of nums where nums[index] has set bit in jth position
        Arrays.fill(setBitIndex, -1);
        for(int i = nums.length - 1; i >= 0; i--){
            int endIndex = i;
            for(int j = 0; j < 32; j++){
                if((nums[i] & (1 << j)) == 0){//jth bit not set in current number
                    if(setBitIndex[j] != -1){
                        endIndex = Math.max(endIndex, setBitIndex[j]);
                    }
                }
                else{
                    setBitIndex[j] = i;
                }
            }
            result[i] = endIndex - i + 1;
        }
        return result;
    }
}
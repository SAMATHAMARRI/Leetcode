class Solution {
    public void moveZeroes(int[] nums) {
        int prevIdx = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[prevIdx] != 0){
                prevIdx++;
                continue;
            }
            if(nums[i] != 0 && nums[prevIdx] == 0){
                nums[prevIdx] = nums[i];
                nums[i] = 0;
                prevIdx++;
            }
        }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIdx = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[prevIdx] = nums[i + 1];
                prevIdx++;
            }
        }
        return prevIdx;
    }
}
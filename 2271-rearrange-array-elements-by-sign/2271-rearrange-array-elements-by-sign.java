class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIdx = 0,negativeIdx = 1;
        int result[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                result[negativeIdx] = nums[i];
                negativeIdx += 2;
            }
            else{
                result[positiveIdx] = nums[i];
                positiveIdx += 2;
            }
        }
        return result;
    }
}
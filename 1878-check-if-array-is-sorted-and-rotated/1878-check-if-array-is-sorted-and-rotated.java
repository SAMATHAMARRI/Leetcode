class Solution {
    public boolean check(int[] nums) {
        int stIdx = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                stIdx = i;
                break;
            }
        }
        if(stIdx == 0) return true;
        reverse(0, stIdx - 1, nums);
        reverse(stIdx, nums.length - 1, nums);
        reverse(0, nums.length - 1, nums);
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        return Arrays.equals(sorted, nums);
    }
    static void reverse(int stIdx, int endIdx, int nums[]){
        while(stIdx < endIdx){
            int temp = nums[stIdx];
            nums[stIdx] = nums[endIdx];
            nums[endIdx] = temp;
            stIdx++;
            endIdx--;
        }
    }
    
}
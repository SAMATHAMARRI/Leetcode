class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
        
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
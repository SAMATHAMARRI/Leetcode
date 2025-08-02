class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2, j = nums.length - 1;
        while(i >= 0 && nums[i] >= nums[i + 1]){//go until i <= i + 1 where i is nums[i]
            i--;
        }
        if(i >= 0){
            while(nums[j] <= nums[i]){//go until u find greater element than i or equal to i
                j--;
            }
            swap(i, j, nums);
        }
        reverseArr(i + 1, nums.length - 1, nums);
        return;
    }
    static void reverseArr(int i, int j,int[] arr){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}
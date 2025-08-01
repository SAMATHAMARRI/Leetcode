class Solution {
    public int[] rearrangeArray(int[] nums) {
        //O(n + n/2)
        int negativeNum[] = new int[nums.length / 2];
        int positiveNum[] = new int[nums.length / 2];
        int j = 0, k = 0;
        for(int num : nums){
            if(num < 0){
                negativeNum[j] = num;
                j++;
            }
            else{
                positiveNum[k] = num;
                k++;
            }
        }
        for(int i = 0; i < nums.length / 2; i++){
            nums[2 * i] = positiveNum[i];
            nums[(2 * i) + 1] = negativeNum[i];

        }
        return nums;

    }
}
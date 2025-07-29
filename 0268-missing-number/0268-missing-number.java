class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int s = 0;
        int first = -1;
        for(int i = 0; i < nums.length; i++){
            s += nums[i];
            if(nums[i] == 0) first = 0;
        }
        if(first == -1) return 0;
        else return sum - s == 0 ? nums.length : sum -s;
    }
}
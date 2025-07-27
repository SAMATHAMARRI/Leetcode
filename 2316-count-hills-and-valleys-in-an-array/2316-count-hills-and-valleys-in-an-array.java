class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length - 1; i++){
            int p1 = i - 1, p2 = i + 1;
            while(p1 >= 0 && p2 <= nums.length - 1){
                if(nums[p1] == nums[i]) break;
                if(nums[p1] == nums[i]){
                    p1--;
                    continue;
                }
                if(nums[p2] == nums[i]){
                    p2++;
                    continue;
                }
                if((nums[p1] < nums[i] && nums[p2] < nums[i]) || (nums[p1] > nums[i] && nums[p2] > nums[i])){
                    count++;
                    break;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
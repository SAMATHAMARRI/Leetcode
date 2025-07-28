class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, c = 0;
        for(int i = 1; i < (1 << nums.length); i++){
            int currOr = 0;
            for(int j = 0; j < nums.length; j++){
                if(CB(i, j)){
                    currOr |= nums[j];
                }
            }
            if(currOr > maxOr){
                maxOr = currOr;
                c = 1;
            }
            else if(currOr == maxOr){
                c++;
            }
            
        }
        return c;
    }
    static boolean CB(int num, int pos){
        return ((num >> pos) & 1) == 1;
    }
}
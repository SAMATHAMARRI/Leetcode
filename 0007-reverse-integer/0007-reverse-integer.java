class Solution {
    public int reverse(int x) {
        long revNum = 0;
        boolean sign = x < 0 ? true : false;
        x = Math.abs(x);
        while(x > 0){
            int lastDig = x % 10;
            revNum = revNum * 10 + lastDig;
            x = x / 10;
            if(revNum > Integer.MAX_VALUE){
                return 0;
            }
        }
        return sign == true ? (int)revNum * (-1) : (int) revNum;

    }
}
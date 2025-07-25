class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = "";
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                s1 += s.charAt(i);
            }
        }
        return solve(s1,0,s1.length() - 1);
    }
    static boolean solve(String s, int strIdx, int endIdx){
        if(strIdx >= endIdx){
            return true;
        }
        if(s.charAt(strIdx) != s.charAt(endIdx)){
            return false;
        }
        return solve(s, strIdx + 1, endIdx - 1);
    }
}
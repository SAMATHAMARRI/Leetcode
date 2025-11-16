class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int startIndex = 0, maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                startIndex = Math.max(startIndex, hm.get(s.charAt(i)) + 1);
                //hm.put(s.charAt(i), i);
                //maxLength = Math.max(maxLength, i - startIndex + 1);
            }
            hm.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - startIndex + 1);
            
        }
        return maxLength;
    }
}
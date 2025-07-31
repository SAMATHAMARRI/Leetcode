class Solution {
    public boolean digitCount(String num) {
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            hm.put(num.charAt(i), hm.getOrDefault(num.charAt(i), 0) + 1);
        }
        for(int i = 0; i < num.length(); i++){
            int repeat = num.charAt(i) - '0';
            char r = (char)(i + '0');
            if(hm.getOrDefault(r, 0) != repeat) return false;
        }
        return true;
    }
}
class Solution {
    public int subarrayBitwiseORs(int[] arr) { 
        Set<Integer> prev = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            for(int distinctXor : prev){
                curr.add(distinctXor | arr[i]);
                result.add(distinctXor | arr[i]);
            }
            curr.add(arr[i]);
            result.add(arr[i]);
            prev = new HashSet<>(curr);
            curr.clear();
        }
        return result.size();
    }
}
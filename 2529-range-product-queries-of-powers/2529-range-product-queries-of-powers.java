class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        for(int i = 0; i <= 30; i++){
            if(((n >> i) & 1) == 1){
                powers.add(1 << i);
            }
        }
        int result[] = new int[queries.length];
        Arrays.fill(result, 1);
        int mod = (int)(1e9 + 7);
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0], right = queries[i][1];
            for(int j = left; j <= right; j++){
                result[i] = (int)(((long)powers.get(j) * result[i]) % mod);
            }
        }
        return result;
    }
}
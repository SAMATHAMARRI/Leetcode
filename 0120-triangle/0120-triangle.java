class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < triangle.size(); i++){
            for(int j = 0; j < triangle.size(); j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = triangle.get(0).get(0);
        for(int j = 1; j < triangle.size(); j++){
            dp[0][j] = Integer.MAX_VALUE;
        }
        for(int i = 1; i < triangle.size(); i++){
            dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0]; 
        }
        for(int i = 1; i < triangle.size(); i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < triangle.size(); j++){
            min = Math.min(min, dp[triangle.size() - 1][j]);
        }
        return min;

        
    }
}
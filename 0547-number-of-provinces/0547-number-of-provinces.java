class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj= new ArrayList<>();
        boolean visited[] = new boolean[isConnected.length + 1];
        for(int i = 0; i <= isConnected.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;  i < isConnected.length; i++){
            for(int j = 0; j < isConnected.length; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i + 1).add(j + 1);
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i + 1]){
                dfs(i + 1, visited, adj);
                cnt++;
            }
        }
        return cnt;
    }
    public void dfs(int vertex, boolean visited[], List<List<Integer>> adj){
        visited[vertex] = true;
        for(Integer it : adj.get(vertex)){
            if(!visited[it]){
                dfs(it, visited, adj);
            }
        }
    }
}
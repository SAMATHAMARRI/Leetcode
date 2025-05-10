class TrieNode{
        TrieNode c[] = new TrieNode[26];
        boolean isEnd = false;

}
class Trie {
        TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode r = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(r.c[idx] == null){
                r.c[idx] = new TrieNode();
            }
            r = r.c[idx];
        }
        r.isEnd = true;
        
    }
    public boolean search(String word) {
        TrieNode r = root;
        
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(r.c[idx] == null) return false;
            r = r.c[idx];
        }
        if(r.isEnd) return true;
        else return false;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode r = root;
        for(int i = 0; i < prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(r.c[idx] == null) return false;
            r = r.c[idx];
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
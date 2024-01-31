static void insert(TrieNode root, String key) 
{
    // Your code here
    for(char ch: key.toCharArray()){
        if(root.children[ch-'a'] == null){
            root.children[ch-'a'] = new TrieNode();
        }
        root = root.children[ch-'a'];
    }
    root.isEndOfWord = true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    for(char ch: key.toCharArray()){
        if(root.children[ch-'a'] == null){
            return false;
        }
        root = root.children[ch-'a'];
    }
    return root.isEndOfWord;
}

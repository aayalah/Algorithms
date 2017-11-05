class MagicDictionary {

    private Set<String> dictionary;
    /** Initialize your data structure here. */
    public MagicDictionary() {
        dictionary = new HashSet<String>();
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (String str: dict) {
            dictionary.add(str);
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        char[] wordArr = word.toCharArray();
        for(int i = 0; i < wordArr.length; i++) {
            for(char ch = 'a'; ch <= 'z'; ch++) {
                if (wordArr[i] != ch) {
                    char[] tmp = wordArr.clone();
                    tmp[i] = ch;
                    if (dictionary.contains(String.valueOf(tmp))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
package com.risk.fromzero2expert.util;

/**
 * @author : [47140]
 */
public class UtilClass {
    public static boolean isSensitive(String username) {
        Trie trie = new Trie();
        for (String word: new String[]{"操", "你妈", "死了"}) {
            trie.insert(word);
        }

        return trie.searchWord(username) && trie.startPrefix(username);
    }
}

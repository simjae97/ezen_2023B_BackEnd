package myproject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    TrieNode fail;
    List<String> output;

    TrieNode() {
        children = new HashMap<>();
        output = new ArrayList<>();
    }
}
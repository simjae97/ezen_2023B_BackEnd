package myproject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    TrieNode fail;
    List<String> output; //search후 결과값 반환할수있는 필드 생성해둠

    TrieNode() {
        children = new HashMap<>(); //결국 Trie는 맵 구조로 이루어진 트리형태
        output = new ArrayList<>();
    }
}
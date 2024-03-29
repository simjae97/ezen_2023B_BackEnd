package myproject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    TrieNode fail; //ahocorasick용 코드 실패시 다음으로 이동할 노드 지정
    List<String> output; //ahocorasick용 코드 kmp 접두사처럼 동일한 문자열이 나왔을경우 패턴화

    boolean isEndOfWord;

    TrieNode() {
        children = new HashMap<>(); //결국 Trie는 노드가 맵 구조로 이루어진 트리형태
        output = new ArrayList<>();
        isEndOfWord = false; //검색어 기능을 넣기위한 문자열 종료 인지 추가
    }
}
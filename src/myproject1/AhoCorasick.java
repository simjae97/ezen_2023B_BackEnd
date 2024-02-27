package myproject1;



import java.util.*;

public class AhoCorasick {
    private TrieNode root; //맨처음노드

    public AhoCorasick(List<String> patterns) {
        root = new TrieNode(); //부모노드 일단 만들고
        buildTrie(patterns); //빌드로 트리와 실패상태 구현
        buildFailTransitions();
    }

    private void buildTrie(List<String> patterns) { //받아온 리스트 패턴을 그대로 대입해줘서 Trie구조 생성
        for (String pattern : patterns) {
            TrieNode node = root;
            for (char c : pattern.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
            node.output.add(pattern);
        }
    }

    private void buildFailTransitions() {
        Queue<TrieNode> queue = new LinkedList<>(); //실패상태는 queue구조 , KMP와 유사
        for (TrieNode child : root.children.values()) {
            queue.add(child);
            child.fail = root;
        }
        while (!queue.isEmpty()) {
            TrieNode node = queue.poll();
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                char c = entry.getKey();
                TrieNode child = entry.getValue();
                queue.add(child);
                TrieNode failState = node.fail;
                while (failState != null && !failState.children.containsKey(c)) {
                    failState = failState.fail;
                }
                child.fail = failState != null ? failState.children.get(c) : root;
                child.output.addAll(child.fail.output);
            }
        }
    }


    public List<String> search(String text) {
        List<String> results = new ArrayList<>(); //결과값 받아와줄 리설트 생성
        TrieNode currentState = root;   //현재 위치 = 맨처음은 부모
        for (int i = 0; i < text.length(); i++) {   //받아온 문자열반복문 돌리기
            char c = text.charAt(i);    //trie구조이므로 char형태로
            while (currentState != null && !currentState.children.containsKey(c)) {
                currentState = currentState.fail;
            }
            if (currentState == null) {
                currentState = root;
                continue;
            }
            currentState = currentState.children.get(c);
            results.addAll(currentState.output);
        }
        return results;
    }

}
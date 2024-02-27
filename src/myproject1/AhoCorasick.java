package myproject1;



import java.util.*;

public class AhoCorasick {
    private TrieNode root; //맨처음노드

    public AhoCorasick(List<String> patterns) {
        root = new TrieNode(); //부모노드 일단 만들고
        buildTrie(patterns); //생성자 대신 빌드로 만들어둔 패턴리스트 대입
        computeFailFunc();
    }

    private void buildTrie(List<String> patterns) { //받아온 리스트 패턴을 그대로 대입해줘서 Trie구조 생성
        for (String pattern : patterns) {
            TrieNode node = root;
            for (char c : pattern.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode()); // c라는 key값이 존재하지 않을때에만 넣어주겠다
                node = node.children.get(c); //현재 노드를 자식노드로 변경
            }
            node.output.add(pattern); //종료되는 패턴 저장
        }
    }

    private void buildFailTransitions() {
        Queue<TrieNode> queue = new LinkedList<>(); //실패상태는 queue구조 , KMP와 유사
        for (TrieNode child : root.children.values()) {
            queue.add(child);
            child.fail = root; //초기화시 실패할때 루트로 돌아간다
        }
        while (!queue.isEmpty()) {
            TrieNode node = queue.poll(); //넣은 순서대로 다시 큐에서 뽑아옴
            for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
                char c = entry.getKey();
                TrieNode child = entry.getValue();
                queue.add(child);
                TrieNode failState = node.fail;
                while (failState != null && !failState.children.containsKey(c)) { //failState 현재 노드의 실패 노드를 나타내며, failState를 이용하여 해당 노드의 실패 노드를 찾는 과정
                                                                                //현재는 모든 코드가 root여서 단순히 root노드로 돌아가나? 제대로 구현됐는지 헷갈림
                    failState = failState.fail;
                }
                child.fail = failState != null ? failState.children.get(c) : root;
                child.output.addAll(child.fail.output);
            }
        }
    }
//    public void computeFailFunc() { //얘네도 결국 root로 되돌아가는거아닌가 싶긴한데 일ㄹ단 찾아본것들
//        Queue<TrieNode> queue = new LinkedList<>();
//        TrieNode root = this.root;
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            TrieNode now = queue.poll();
//
//            for (Map.Entry<Character, TrieNode> entry : now.children.entrySet()) {
//                char ch = entry.getKey();
//                TrieNode next = entry.getValue();
//
//                if (now == root) {
//                    next.fail = root;
//                } else {
//                    TrieNode prev = now.fail;
//                    while (prev != root && !prev.children.containsKey(ch)) {
//                        prev = prev.fail;
//                    }
//                    if (prev.children.containsKey(ch)) {
//                        prev = prev.children.get(ch);
//                    }
//                    next.fail = prev;
//                }
//
//
//                queue.add(next);
//            }
//        }
//    }
//    public void computeFailFunc() {
//        Queue<TrieNode> queue = new LinkedList<>();
//        TrieNode root = this.root;
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            TrieNode now = queue.poll();
//
//            for (Map.Entry<Character, TrieNode> entry : now.children.entrySet()) {
//                char ch = entry.getKey();
//                TrieNode next = entry.getValue();
//
//                // 부모 노드의 실패 노드를 참조하여 실패 노드를 설정합니다.
//                TrieNode prev = now.fail;
//                while (prev != root && !prev.children.containsKey(ch)) {
//                    prev = prev.fail;
//                }
//                if (prev.children.containsKey(ch)) {
//                    prev = prev.children.get(ch);
//                }
//                next.fail = prev;
//
//                queue.add(next);
//            }
//        }
//    }

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
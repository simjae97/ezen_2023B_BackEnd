package myproject1;



import java.util.*;

public class AhoCorasick {
    private TrieNode root;

    public AhoCorasick(List<String> patterns) {
        root = new TrieNode();
        buildTrie(patterns);
        buildFailTransitions();
    }

    private void buildTrie(List<String> patterns) {
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
        Queue<TrieNode> queue = new LinkedList<>();
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
        List<String> results = new ArrayList<>();
        TrieNode currentState = root;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
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
package com.codefight;

/**
 * Created by sunilpatil on 3/3/17.
 */
public class TrieST<Value> {
    private static int R = 256;
    private Node root;

    static class Node {
        Object value;
        private Node[] next = new Node[R];
    }

    public Value get(String key) {
        Node x = get(root, key, 0);
        if (x == null)
            return null;
        return (Value) x.value;
    }

    public Node get(Node x, String key, int index) {
        if (x == null)
            return null;
        if (index == key.length())
            return x;
        char c = key.charAt(index);
        return get(x.next[c], key, index + 1);
    }

    public void put(String key, Value value) {
        root = put(root, key, value, 0);
    }

    public Node put(Node x, String key, Value val, int d) {
        if (x == null)
            x = new Node();
        if (d == key.length()) {
            x.value = val;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d);
        return x;
    }
}

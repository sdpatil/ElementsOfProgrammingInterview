package com.alg.misc.cache;

/**
 * Created by sunilpatil on 3/14/17.
 */
public class Node {
     int key;
     int value;
    Node pre;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

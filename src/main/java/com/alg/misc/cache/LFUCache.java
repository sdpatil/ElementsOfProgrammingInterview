package com.alg.misc.cache;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * Created by sunilpatil on 3/14/17.
 */
public class LFUCache {
    private Node head = null;
    private int cap =0;
    private HashMap<Integer,Integer> valueHashMap = null;
    private HashMap<Integer,LFUNode> nodeHash = null;

    public LFUCache(int capacity){
        this.cap = capacity;
        valueHashMap = new HashMap<Integer, Integer>();
        nodeHash = new HashMap<Integer, LFUNode>();
    }

    public int get(int key){
        if(valueHashMap.containsKey(key)){
            //
        }
        return 1;
    }

    public void increaseCount(int key){
        LFUNode node = nodeHash.get(key);
        node.keys.remove(key);
    }


    static class LFUNode{
        public int count = 0;
        public LinkedHashSet<Integer> keys =null;
        public LFUNode prev = null;
        public LFUNode next = null;

        public LFUNode(int count){
            this.count = count;
            keys = new LinkedHashSet<Integer>();
            prev =null;
            next = null;
        }
    }
}

package com.alg.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by spatil30 on 2/7/2017.
 */
public class TriesST<Value> {
    private static int R = 256;
    private Node root;

    private static class Node{

        private Object val;
        private Node[] next = new Node[R];
    }

    public Value get(String key){
        Node x = get(root, key, 0);
        if(x == null)
            return null;
        return (Value)x.val;
    }

    public Node get(Node x, String key, int d){
        if(x == null )
            return null;
        if(d == key.length())
            return x;
        char c = key.charAt(d);
        return get(x.next[c],key,d+1);
    }

    public void put(String key, Value val){
        root = put(root,key,val,0);
    }

    public Node put(Node x, String key, Value value, int d){
        if (x == null)
           x = new Node();
        if(d == key.length()){
            x.val = value;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x.next[c],key,value,d+1);
        return x;
    }

    public Iterable<String> keys(){
        return keysWithPrefix("");
    }

    public Iterable<String> keysWithPrefix(String prefix){
        List<String> q = new ArrayList<String>();
        collect(get(root,prefix,0),prefix,q);
        return q;
    }

    private void collect(Node x, String pre, List<String> list){
        if(x == null)
            return;
        if(x.val != null)
            list.add(pre);
        for(char c = 0; c < R ;c++)
            collect(x.next[c],pre+c,list);
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x == null)
            return 0;
        int cnt = 0;
        if(x.val != null)
            cnt++;
        for(char c = 0 ; c< R; c++)
            cnt += size(x.next[c]);
        return cnt;
    }

    public static void main(String[] arg){
        TriesST triesST = new TriesST();
        triesST.put("Hi","2");
        triesST.put("Hire","4");
        triesST.put("Him","2");
        triesST.put("Hello","5");
        triesST.put("Hell","4");
        triesST.put("He","2");
        System.out.println(triesST.get("Hi"));
        System.out.println("Size -> " +triesST.size());
        for(Object c:triesST.keys())
            System.out.println(c);
    }
}

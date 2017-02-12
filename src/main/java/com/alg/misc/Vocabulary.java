package com.alg.misc;

/**
 * Created by spatil30 on 2/7/2017.
 */
public interface Vocabulary {
    boolean add(String word);
    boolean isPrefix(String prefix);
    boolean contains(String word);
}

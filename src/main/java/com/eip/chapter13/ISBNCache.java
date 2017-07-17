package com.eip.chapter13;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem: Implement LRU Cache for storing isbn to price
 * Basic Idea: Use LinkedHashMap with access order and override removeEldestEntry() method that
 * deletes the last access object from hashmap
 */
public class ISBNCache {
    LinkedHashMap<Integer, Integer> isbnToPriceCache;
    public ISBNCache(final int capacity){
        //Value of true for third parameter means order by access order
        //Value of 1.0f for laod factor means load factor is 1, size and capacity are same
        isbnToPriceCache = new LinkedHashMap<Integer, Integer>(capacity,1.0f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return this.size() > capacity;
            }
        };
    }

    public Integer lookup(Integer isbnKey){
        return isbnToPriceCache.get(isbnKey);
    }

    public void insert(Integer key, Integer value){
        Integer currentValue = isbnToPriceCache.get(key);
        isbnToPriceCache.put(key,value);

    }

    public void erase(Integer key){
        isbnToPriceCache.remove(key);
    }
}

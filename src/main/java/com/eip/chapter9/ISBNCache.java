package com.eip.chapter9;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class ISBNCache {
    LinkedHashMap<Integer, Integer> isbnToPriceCache;
    public ISBNCache(final int capacity){
        isbnToPriceCache = new LinkedHashMap<Integer, Integer>(capacity){
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

package com.chirag.ib.heapmaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LruCache {

	class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

		private static final long serialVersionUID = 8188769297194698555L;
		private int capacity;
		
		public FixedSizeLinkedHashMap(int capacity, float loadFactor, boolean accessOrder) {
			super(capacity, loadFactor, accessOrder);
			this.capacity = capacity;
		}
		
		@Override
		protected boolean removeEldestEntry(Entry<K, V> eldest) {
			return this.size() > this.capacity;
		}
	}
	
	private Map<Integer, Integer> cacheMap = null;
	
	public LruCache(int capacity) {
        this.cacheMap = new FixedSizeLinkedHashMap<Integer, Integer>(capacity, 1, true);
    }
    
    public int get(int key) {
        if(this.cacheMap.containsKey(key))
        	return this.cacheMap.get(key);
        else
        	return -1;
    }
    
    public void set(int key, int value) {
        this.cacheMap.put(key, value);	
    }
	
}

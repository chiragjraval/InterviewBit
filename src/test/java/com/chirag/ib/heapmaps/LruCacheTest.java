package com.chirag.ib.heapmaps;

import org.junit.Assert;
import org.junit.Test;

public class LruCacheTest {

	@Test
	public void test1() {
		LruCache cache = new LruCache(2);
		cache.set(1, 11);
		cache.set(2, 22);
		cache.get(2);
		cache.set(3, 33);
		
		Assert.assertEquals(33, cache.get(3));
		Assert.assertEquals(22, cache.get(2));
		Assert.assertEquals(-1, cache.get(1));
	}
	
	@Test
	public void test2() {
		LruCache cache = new LruCache(4);
		cache.set(1, 11);
		cache.set(2, 22);
		cache.get(2);
		cache.set(3, 33);
		cache.set(4, 44);
		cache.set(5, 55);
		
		Assert.assertEquals(55, cache.get(5));
		Assert.assertEquals(44, cache.get(4));
		Assert.assertEquals(33, cache.get(3));
		Assert.assertEquals(22, cache.get(2));
		Assert.assertEquals(-1, cache.get(1));
	}
}

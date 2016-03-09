package com.szty.commos.cache.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.cache.support.SimpleValueWrapper;

import net.sf.ehcache.Ehcache;

/**
 * 实现 Apache Cache 接口 由 Spring Cache ClassName: SpringCacheWrapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 上午10:48:13 <br/>
 * 如果是其他接口
 * 
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class SpringCacheWrapper implements Cache<Object, Object> {

	private org.springframework.cache.Cache springCache;

	
	public SpringCacheWrapper(org.springframework.cache.Cache springCache) {
		
		this.springCache = springCache;
	}

	/**
	 * 清除缓存
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.cache.Cache#clear()
	 * @author mao.ru 
	 * date: 2016年3月7日 上午11:17:25 <br/>
	 */
	public void clear() throws CacheException {

		springCache.clear();
	}

	public Object get(Object key) throws CacheException {
		Object value = springCache.get(key);
		if (value instanceof SimpleValueWrapper) {
			return ((SimpleValueWrapper) value).get();
		}
		return value;
	}

	/**
	 * 
	 * TODO 简单描述该方法的实现功能（获取缓存的所有key）.
	 * 
	 * @see org.apache.shiro.cache.Cache#keys()
	 * @author mao.ru date: 2016年3月7日 上午11:11:15 <br/>
	 */
	public Set<Object> keys() {
		Set<Object> set = new HashSet<Object>();
		if (springCache.getNativeCache() instanceof Ehcache) {
			Ehcache ehcache = (Ehcache) springCache.getNativeCache();
			List<?> cheKeys = ehcache.getKeys();
			if (!cheKeys.isEmpty()) {
				set.addAll(cheKeys);
				cheKeys.clear();
			}
			return set;
		}
		throw new UnsupportedOperationException("invoke spring cache abstract keys method not supported");
	}
	
	

	public Object put(Object key, Object value) throws CacheException {
		springCache.put(key, value);
		return null;
	}

	public Object remove(Object key) throws CacheException {
		springCache.evict(key);
		return null;
	}

	/**
	 * 获取缓存总数
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.cache.Cache#size()
	 * @author mao.ru 
	 * date: 2016年3月7日 上午11:15:50 <br/>
	 */
	public int size() {
		if (springCache.getNativeCache() instanceof Ehcache) {
			Ehcache ehcache = (Ehcache) springCache.getNativeCache();
			return ehcache.getSize();
		}
		throw new UnsupportedOperationException("invoke spring cache abstract size method not supported");
	}

	/**
	 * 获取所有的值
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.cache.Cache#values()
	 * @author mao.ru 
	 * date: 2016年3月7日 上午11:16:15 <br/>
	 */
	public Collection<Object> values() {
		if (springCache.getNativeCache() instanceof Ehcache) {
			Ehcache ehcache = (Ehcache) springCache.getNativeCache();
			List<?> keys = ehcache.getKeys();
			if (!CollectionUtils.isEmpty(keys)) {
				List<Object> values = new ArrayList<Object>(keys.size());
				for (Object key : keys) {
					Object value = get(key);
					if (value != null) {
						values.add(value);
					}
				}
				return Collections.unmodifiableList(values);
			} else {
				return Collections.emptyList();
			}
		}
		throw new UnsupportedOperationException("invoke spring cache abstract values method not supported");
	}
}

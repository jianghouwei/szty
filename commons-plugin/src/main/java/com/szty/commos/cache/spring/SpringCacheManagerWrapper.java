package com.szty.commos.cache.spring;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

/**
 * ehcache ,spring cache 封装 ClassName: SpringCacheManagerWrapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 上午10:23:49 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class SpringCacheManagerWrapper implements CacheManager {

	private org.springframework.cache.CacheManager cacheManager;

	/**
	 * 设置spring cache manager
	 *
	 * @param cacheManager
	 */
	public void setCacheManager(org.springframework.cache.CacheManager cacheManager) {

		this.cacheManager = cacheManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <K, V> Cache<K, V> getCache(String name) throws CacheException {
		org.springframework.cache.Cache springCache = cacheManager.getCache(name);
		return (Cache<K, V>) new SpringCacheWrapper(springCache);
	}

}

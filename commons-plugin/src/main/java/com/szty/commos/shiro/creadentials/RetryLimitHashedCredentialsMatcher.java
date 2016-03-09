package com.szty.commos.shiro.creadentials;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import com.szty.commos.shiro.utils.EndecryptUtils;

/**
 * 登录次数验证 ClassName: RetryLimitHashedCredentialsMatcher <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 上午11:25:00 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {

	private Cache<String, AtomicInteger> passwordRetryCache;

	public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {

		passwordRetryCache = cacheManager.getCache("passwordRetryCache");
	}

	/**
	 * 登录次数记录   
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.authc.credential.HashedCredentialsMatcher#doCredentialsMatch(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.authc.AuthenticationInfo)
	 * @author mao.ru 
	 * date: 2016年3月7日 上午11:27:04 <br/>
	 */
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		String username = (String) token.getPrincipal();
		// retry count + 1
		AtomicInteger retryCount = passwordRetryCache.get(username);
		if (retryCount == null) {
			retryCount = new AtomicInteger(0);
			passwordRetryCache.put(username, retryCount);
		}
		if (retryCount.incrementAndGet() > 50) {
			// if retry count > 5 throw
			throw new ExcessiveAttemptsException();
		}
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String password = "";
		if (upToken.getPassword() != null) {
			password = new String(upToken.getPassword());
		}
		if (EndecryptUtils.md5Password(password).equals(info.getCredentials())) {
			passwordRetryCache.remove(username);
			return true;
		}
		return false;
	}
}

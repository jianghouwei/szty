package com.szty.commos.shiro.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.szty.commos.shiro.utils.Constants;
import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.service.SysUsersService;

/**
 * 
 * ClassName: SysUserFilter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 下午1:51:46 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class SysUserFilter extends AccessControlFilter {

	@Autowired
	private SysUsersService sysUsersService;
	

    /**
     * 用户删除了后重定向的地址
     */
	private String userNotfoundUrl;
    /**
     * 用户锁定后重定向的地址
     */
    private String userBlockedUrl;
    /**
     * 未知错误
     */
    private String userUnknownErrorUrl;
    

	/**
	 * 表示是否允许访问 TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see org.apache.shiro.web.filter.AccessControlFilter#isAccessAllowed(javax.servlet.ServletRequest,
	 *      javax.servlet.ServletResponse, java.lang.Object)
	 * @author mao.ru date: 2016年3月7日 下午1:51:51 <br/>
	 */
	@Override
	protected boolean isAccessAllowed(ServletRequest req, ServletResponse rep, Object obj) throws Exception {
		SysUsers user = (SysUsers) req.getAttribute(Constants.CURRENT_USER);
		if (user == null) {
			return true;
		}
		// 判断用户是否存在
		if (Boolean.TRUE.equals(user.getIsDelete())) {
			getSubject(req, rep).logout();
			saveRequestAndRedirectToLogin(req, rep);
			return false;
		}
		return true;
	}

	/**
	 * 表示当访问拒绝时是否已经处理了；如果返回true表示需要继续处理；如果返回false表示该拦截器实例已经处理了，将直接返回即可。 TODO
	 * 简单描述该方法的实现功能（可选）.
	 * 
	 * @see org.apache.shiro.web.filter.AccessControlFilter#onAccessDenied(javax.servlet.ServletRequest,
	 *      javax.servlet.ServletResponse)
	 * @author mao.ru date: 2016年3月7日 下午1:51:58 <br/>
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest req, ServletResponse rep) throws Exception {
		getSubject(req, rep).logout();
		saveRequestAndRedirectToLogin(req, rep);
		return true;
	}

	/**
	 * 预处理，检验账户是否存在，存在就写入session 中，方便后续处理
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.web.filter.PathMatchingFilter#preHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 * @author mao.ru 
	 * date: 2016年3月7日 下午4:22:58 <br/>
	 */
	@Override
	protected boolean preHandle(ServletRequest req, ServletResponse rep) throws Exception {
		Subject subject = getSubject(req, rep);
		if (subject == null) {
			return true;
		}
		String username = (String) subject.getPrincipal();
		// 此处注意缓存 防止大量的查询db 采用缓存模式
		SysUsers user = sysUsersService.queryByUserName(username);
		// 把当前用户放到session中
		req.setAttribute(Constants.CURRENT_USER, user);
		// druid监控需要
		// ((HttpServletRequest)req).getSession().setAttribute(Constants.CURRENT_USERNAME,
		// username);

		return true;
	}

	/**
	 *  登陆url 请求处理！
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see org.apache.shiro.web.filter.AccessControlFilter#redirectToLogin(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 * @author mao.ru 
	 * date: 2016年3月7日 下午4:22:29 <br/>
	 */
	protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
		SysUsers user = (SysUsers) request.getAttribute(Constants.CURRENT_USER);
		String url = null;
		if (Boolean.TRUE.equals(user.getIsDelete())) {
			url = getUserNotfoundUrl();
		} else if (Boolean.TRUE.equals(user.getIsEnable())) {
			url = getUserBlockedUrl();
		} else {
			url = getUserUnknownErrorUrl();
		}

		WebUtils.issueRedirect(request, response, url);
	}


	public String getUserNotfoundUrl() {
		return userNotfoundUrl;
	}

	public void setUserNotfoundUrl(String userNotfoundUrl) {
		this.userNotfoundUrl = userNotfoundUrl;
	}

	public String getUserBlockedUrl() {
		return userBlockedUrl;
	}

	public void setUserBlockedUrl(String userBlockedUrl) {
		this.userBlockedUrl = userBlockedUrl;
	}

	public String getUserUnknownErrorUrl() {
		return userUnknownErrorUrl;
	}

	public void setUserUnknownErrorUrl(String userUnknownErrorUrl) {
		this.userUnknownErrorUrl = userUnknownErrorUrl;
	}

	
}

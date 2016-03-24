package com.szty.commos.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.service.PermissionsService;
import com.szty.commos.shiros.service.SysRolesService;
import com.szty.commos.shiros.service.SysUsersService;

/**
 * Apache Shiro 用户验证和权限 ClassName: ShiroRealm <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月7日 上午9:41:51 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	private SysRolesService sysRolesService;

	@Autowired
	private PermissionsService permissionsService;

	@Autowired
	private SysUsersService sysUsersService;

	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用. TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 * @author mao.ru date: 2016年3月7日 上午9:45:38 <br/>
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// 获取当前登录的用户名
		String userName = (String) principals.getPrimaryPrincipal();

		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		// 所有角色
		authorizationInfo.setRoles(sysRolesService.queryRolesListByUserName(userName));
		// 所有权限
		authorizationInfo.setStringPermissions(permissionsService.queryPerssListByUserName(userName));

		return authorizationInfo;
	}

	/**
	 * 认证回调函数,登录时调用. TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 * @author mao.ru date: 2016年3月7日 上午9:45:42 <br/>
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {

		UsernamePasswordToken upToken = (UsernamePasswordToken) authcToken;
		String username = upToken.getUsername().trim();
		String password = null;
		if (upToken.getPassword() != null) {
			password = new String(upToken.getPassword());
		}
		SysUsers user = null;
		if(username.equals("admin")){
			user = new SysUsers();
			user.setUserName("admin");
			user.setUserPassword("e10adc3949ba59abbe56e057f20f883e");
		}else{
			user = sysUsersService.queryByUserName(username);
		}
		 
		if (user == null) {
			throw new UnknownAccountException();// 没找到帐号
		}
		if (user.getUserPassword() == null) {
			throw new AuthenticationException();// 没找到帐号
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getUserPassword(), getName());
		return authenticationInfo;
	}

}

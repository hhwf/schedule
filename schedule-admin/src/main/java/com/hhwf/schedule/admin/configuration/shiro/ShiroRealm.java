package com.hhwf.schedule.admin.configuration.shiro;

import com.hhwf.schedule.admin.entity.User;
import com.hhwf.schedule.admin.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 32958 on 2019/11/30.
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;

    /**
     * 权限授权
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        User user = userService.findByName(userName);
        if (user != null) {
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName, password.toCharArray(), getName());
            return info;
        }

        return null;
    }
}

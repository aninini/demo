package com.lizhishen.config.security.login;

import com.lizhishen.config.security.dto.SecurityUser;
import com.lizhishen.modules.common.dto.output.ApiResult;
import com.lizhishen.utils.ResponseUtils;
import com.lizhishen.modules.system.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p> 认证成功处理 </p>
 *
 */
@Component
public class AdminAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse response, Authentication auth) throws IOException, ServletException {
        User user = new User();
        SecurityUser securityUser = ((SecurityUser) auth.getPrincipal());
        user.setToken(securityUser.getCurrentUserInfo().getToken());
        ResponseUtils.out(response, ApiResult.ok("登录成功!", user));
    }
}

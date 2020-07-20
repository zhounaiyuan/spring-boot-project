package com.zcset.platform.server.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：zny
 * @date ：Created in 2020/6/30 11:25
 * @description：自定义权限拦截器
 * @modified By：
 * @version: 1.0$
 */

public class AuthInterceptor implements HandlerInterceptor {
    @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("sessionId".equals(cookie.getName())) {
                    String value = cookie.getValue();
                    System.out.println(value);
                } else
                    {
                        //response.sendRedirect("/error/" + response.getStatus());
                        response.setStatus(404);
                        return false;
                    }
            }
        } else {
            response.setStatus(404);
            //response.sendRedirect("/error/" + response.getStatus());
            //return false;
        }
        System.out.println("拦截器执行了");
        return true;
    }

}

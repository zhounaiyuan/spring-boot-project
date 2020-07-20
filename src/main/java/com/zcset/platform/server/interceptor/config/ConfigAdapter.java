package com.zcset.platform.server.interceptor.config;

import com.zcset.platform.server.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：zny
 * @date ：Created in 2020/6/30 13:49
 * @description：配置拦截器
 * @modified By：
 * @version: 1.0$
 */

@Configuration
public class ConfigAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**").excludePathPatterns("/boot/setCookies");
    }
}

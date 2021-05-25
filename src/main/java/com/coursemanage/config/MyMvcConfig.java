package com.coursemanage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展使用SpringMVC
 * @author shuai
 */
@Configuration
@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 用于配置视图名称
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/index.html").setViewName("admin/index");
    }

    /**
     * 自定义的国际化组件就生效了
     */

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    /**
     * 添加拦截器组件
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 注册拦截器，及拦截请求和要剔除哪些请求!
        // 我们还需要过滤静态资源文件，否则样式显示不出来
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login.html","/login","/","/css/*","/img/**","/js/**");
    }
}

package com.coursemanage.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 李二帅
 * @version 1.0
 * @Date 2021/05/20 下午 5:40
 */
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 定制请求的授权规则
        // 首页所有人可以访问
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/admin/**").hasRole("admin")
                .antMatchers("/front/**").hasRole("front");
    }
}

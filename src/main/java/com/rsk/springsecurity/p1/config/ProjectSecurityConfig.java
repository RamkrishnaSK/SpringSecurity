package com.rsk.springsecurity.p1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/myApp/accounts/", "/myApp/balance/", "/myApp/loans/", "/myApp/cards/")
				.authenticated().antMatchers("/myApp/contact/", "/myApp/notice/").permitAll().and().httpBasic().and()
				.formLogin();
		return http.build();     
	}
  
}

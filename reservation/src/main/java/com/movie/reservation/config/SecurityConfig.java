package com.movie.reservation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
* @packageName    : com.movie.reservation.config
* @fileName        : SecurityConfig.java
* @author        : Taeyoung kwon
* @date            : 2022.07.02
* @description            :
* ===========================================================
* 1. 스프링 시큐리티 설정 
* ===========================================================
* DATE              AUTHOR             NOTE
* -----------------------------------------------------------
* 2022.07.02        Taeyoung kwon       최초 생성
*/
@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests()
				//로그인 , resources파일 모든 권한 부여
				.antMatchers("/","/resources/**").permitAll()
				//USER, ADMIN 접근 허용~~~
				.antMatchers("/").hasRole("USER")
				.antMatchers("/").hasRole("ADMIN")
				.and()
			.formLogin()
				.loginPage("/login")//로그인페이지
				.loginProcessingUrl("/login")//구현한 로그인 페이지
				.defaultSuccessUrl("/login_check")// 로그인 성공 시 제공할 페이지
				.failureUrl("/login_error")//로그인 실패 시 제공할 페이지, 로그인 form으로 파라미터값 error=true로 보낸다.
				.and()
			.csrf().disable();//사이트 간 요청 위조(Cross-Site Request Forgery) 공격 방지 기능 키기
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(null).passwordEncoder(new BCryptPasswordEncoder());
//	}

	
	

	

	
}

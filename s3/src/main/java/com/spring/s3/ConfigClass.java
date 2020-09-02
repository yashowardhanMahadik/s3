package com.spring.s3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class ConfigClass extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("blah")
			.password("blah")
			.roles("USER")
			.and()
			.withUser("foo")
			.password("foo")
			.roles("ADMIN");
		 
	}
	
	@Bean 
	public PasswordEncoder getPasswordEncoder() {
		// TODO Auto-generated method stub
		return NoOpPasswordEncoder.getInstance();

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.antMatchers("/haha/user").access("hasRole('USER')")//("USER","ADMIN")
				.antMatchers("/haha/admin").hasRole("ADMIN")
				//.antMatchers("/").permitAll()
				.and()
				.formLogin();
		
	}
}

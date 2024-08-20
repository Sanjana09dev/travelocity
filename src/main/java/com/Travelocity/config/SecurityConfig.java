package com.Travelocity.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// These are the first level of classes that gets loaded into springIOC when started
public class SecurityConfig {



    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        //before any other filter that happens or before even
        // you run this SecurityFiler methods you run that method first


        //saving from hacking attacks
        //cross-site-request-forgery
        http.csrf().disable().cors().disable();


          http.authorizeHttpRequests().anyRequest().permitAll();

        return http.build();
    }
}
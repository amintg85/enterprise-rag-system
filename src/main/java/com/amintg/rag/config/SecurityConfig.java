package com.amintg.rag.config;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.*;
@Configuration
public class SecurityConfig{@Bean SecurityFilterChain f(HttpSecurity h)throws Exception{h.csrf(c->c.disable()).authorizeHttpRequests(a->a.anyRequest().permitAll());return h.build();}}

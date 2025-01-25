package com.example.securitypoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain freak(HttpSecurity http) throws Exception {

    	System.out.println("security filter setup");
    	//what all things need security...
        http.csrf().disable()
                .authorizeHttpRequests((authorize) -> {
                    authorize.requestMatchers("/math/add/**").authenticated();
                    authorize.requestMatchers("/math/subtract/**").permitAll();
                    
                    
                }).httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){

    	System.out.println("user setup");
        UserDetails abc = User.builder()
                .username("abc")
                .password(passwordEncoder().encode("def"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(abc, admin);
    }
}
package com.example.book.config;  //  <--  Correct package declaration!

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.book.controller.BCryptPasswordEncoder;

@Configuration
public class AppConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

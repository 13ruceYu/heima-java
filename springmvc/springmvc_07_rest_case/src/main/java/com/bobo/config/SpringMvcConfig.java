package com.bobo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.bobo.controller", "com.bobo.config"})
@EnableWebMvc
public class SpringMvcConfig {
}

package com.bobo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bobo")
@PropertySource("jdbc.properties")
public class SpringConfig {
}

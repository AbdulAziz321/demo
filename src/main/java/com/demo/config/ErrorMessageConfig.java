package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:error-message.properties")
public class ErrorMessageConfig {
        
}

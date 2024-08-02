package com.deynak.config;

import com.deynak.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {
    @Bean(name = "timer")
    public Timer timer() {
        return new Timer();
    }
}
package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    int version() {
        return 55;
    }

    @Bean
    ApplicationRunner myApplicationRunner() {
        return args -> {
            work1();
            work2();
        };
    }

    private void work1() {
        System.out.println("work1");
    }

    private void work2() {
        System.out.println("work2");
    }
}
package com.applcation.cleanApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // يمكنك تحديد المصادر المسموح بها هنا
        config.addAllowedMethod("*"); // يمكنك تحديد الطرق المسموح بها هنا
        config.addAllowedHeader("*"); // يمكنك تحديد الرؤوس المسموح بها هنا
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}


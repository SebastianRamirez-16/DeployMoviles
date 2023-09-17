package com.upc.saveup.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")
                .allowedOrigins("https://saveupp.netlify.app")     //(Aqui colocan la url de su frontend desplegada)
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("https://saveupp.netlify.app")
                        .allowCredentials(true);
    }
}
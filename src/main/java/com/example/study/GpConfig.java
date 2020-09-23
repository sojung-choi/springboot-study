package com.example.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class GpConfig implements WebMvcConfigurer {
    //@Value("${cors.allowedOrigins}")
    //private String allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry cr){
        cr.addMapping("/**")
                .allowedOrigins("*")
                //.allowedOrigins("http://127.0.0.1:8080/postMethod")  // 허용할 주소 및 포트
                //.allowedOrigins("http://localhost:8080/postMethod")  // 허용할 주소 및 포트
                //.allowedOrigins("http://127.0.0.1:8080/postBoard")  // 허용할 주소 및 포트
                //.allowedOrigins("http://localhost:8080/postBoard")  // 허용할 주소 및 포
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}

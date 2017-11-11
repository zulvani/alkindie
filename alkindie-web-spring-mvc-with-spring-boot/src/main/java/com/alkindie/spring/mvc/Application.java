package com.alkindie.spring.mvc;

import com.alkindie.spring.mvc.interceptor.AlkindieInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages = "com.alkindie.spring.mvc")
public class Application extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AlkindieInterceptor());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

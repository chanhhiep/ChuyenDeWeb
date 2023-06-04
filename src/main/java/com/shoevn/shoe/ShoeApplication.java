package com.shoevn.shoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;

import java.util.Arrays;

@SpringBootApplication
public class ShoeApplication {
    /*
    @Bean
    public FormHttpMessageConverter formHttpMessageConverter() {
        FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
        formHttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_FORM_URLENCODED));
        return formHttpMessageConverter;
    }*/
    public static void main(String[] args) {
        SpringApplication.run(ShoeApplication.class, args);
    }

}

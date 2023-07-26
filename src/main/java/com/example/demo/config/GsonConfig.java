package com.example.demo.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/1
 */
//@Configuration
public class GsonConfig {
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        GsonBuilder builder = new GsonBuilder();
//        builder.setDateFormat("yyyy-MM-dd");
//        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
//        Gson gson = builder.create();
//        converter.setGson(gson);
//        return converter;
//    }
}

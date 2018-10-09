package com.ford.devenablement.functions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class BeanFunction {

    @Bean
    public Function<String, String> reverseString() {

        return value -> new StringBuilder(value).reverse().toString();
    }
}


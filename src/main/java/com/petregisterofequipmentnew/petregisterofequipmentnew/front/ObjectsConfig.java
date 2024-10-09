package com.petregisterofequipmentnew.petregisterofequipmentnew.front;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
@Configuration
public class ObjectsConfig {

    @Bean
    public RestClient builderObject(@Value("${api.base.url}") String baseUrl){
        return RestClient.builder()
                .baseUrl(baseUrl)
                .build();
    }
}

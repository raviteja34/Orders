package com.store.orders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class confg {

    @Bean
    public RestClient restClient() {
        return RestClient.builder().build();
    }
}
